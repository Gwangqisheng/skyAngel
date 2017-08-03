package com.personal.skyAngel.comtroller;

import java.util.SortedMap;
import java.util.TreeMap;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class WeiXinPay {
    @ResponseBody
    @RequestMapping(value = "/weixinpay.do", produces = "text/html;charset=UTF-8", method = { RequestMethod.POST })
    public static String weixinpay(String body, // 商品描述
            String detail, // 商品详情
            String attach, // 附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
            String out_trade_no, // 商户系统内部的订单号,32个字符内、可包含字母, 其他说明见商户订单号
            String total_price, // 订单总金额，单位为分，详见支付金额
            String spbill_create_ip // 用户端实际ip

    ) throws Exception {

        WeixinConfigUtils config = new WeixinConfigUtils();
        // 参数组
        String appid = config.appid;// 微信开放平台审核通过的应用APPID
        System.out.println("appid是：" + appid);
        String mch_id = config.mch_id;
        System.out.println("mch_id是：" + mch_id);
        String nonce_str = RandCharsUtils.getRandomString(16);
        System.out.println("随机字符串是：" + nonce_str);

        body = body;// "测试微信支付0.01_2";
        detail = detail;// "0.01_元测试开始";
        // attach = attach;//"备用参数，先留着，后面会有用的";
        // String out_trade_no = OrderUtil.getOrderNo();//"2015112500001000811017342394";

        double totalfee = 0;
        try {
            totalfee = Double.parseDouble(total_price);//// 单位是分，即是0.01元
        } catch (Exception e) {
            totalfee = 0;
        }
        int total_fee = (int) (totalfee * 100);
        spbill_create_ip = spbill_create_ip;// "127.0.0.1";

        String time_start = RandCharsUtils.timeStart();
        System.out.println(time_start);
        String time_expire = RandCharsUtils.timeExpire();
        System.out.println(time_expire);
        String notify_url = config.notify_url;
        System.out.println("notify_url是：" + notify_url);
        String trade_type = "APP";

        // 参数：开始生成签名
        SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
        parameters.put("appid", appid);
        parameters.put("mch_id", mch_id);
        parameters.put("nonce_str", nonce_str);
        parameters.put("body", body);
        // parameters.put("nonce_str", nonce_str);
        parameters.put("detail", detail);
        parameters.put("attach", attach);
        parameters.put("out_trade_no", out_trade_no);
        parameters.put("total_fee", total_fee);
        parameters.put("time_start", time_start);
        parameters.put("time_expire", time_expire);
        parameters.put("notify_url", notify_url);
        parameters.put("trade_type", trade_type);
        parameters.put("spbill_create_ip", spbill_create_ip);

        String sign = WXSignUtils.createSign("UTF-8", parameters);
        System.out.println("签名是：" + sign);

        Unifiedorder unifiedorder = new Unifiedorder();
        unifiedorder.setAppid(appid);
        unifiedorder.setMch_id(mch_id);
        unifiedorder.setNonce_str(nonce_str);
        unifiedorder.setSign(sign);
        unifiedorder.setBody(body);
        unifiedorder.setDetail(detail);
        unifiedorder.setAttach(attach);
        unifiedorder.setOut_trade_no(out_trade_no);
        unifiedorder.setTotal_fee(total_fee);
        unifiedorder.setSpbill_create_ip(spbill_create_ip);
        unifiedorder.setTime_start(time_start);
        unifiedorder.setTime_expire(time_expire);
        unifiedorder.setNotify_url(notify_url);
        unifiedorder.setTrade_type(trade_type);

        System.out.println(MD5Utils.md5("fenxiangzhuyi") + "========================");

        // 构造xml参数
        String xmlInfo = HttpXmlUtils.xmlInfo(unifiedorder);

        String wxUrl = "https://api.mch.weixin.qq.com/pay/unifiedorder";

        String method = "POST";

        String weixinPost = HttpXmlUtils.httpsRequest(wxUrl, method, xmlInfo).toString();

        System.out.println(weixinPost);

        ParseXMLUtils.jdomParseXml(weixinPost);

        String json = JsonUtil.xml2jsonString(weixinPost);

        System.out.println("=========================================================");

        Bean b = JsonUtil.getSingleBean(json, Bean.class);
        if (null != b) {
            WeixinOrder weixin = b.getXml();
            // 参数：开始生成签名
            SortedMap<Object, Object> par = new TreeMap<Object, Object>();
            par.put("appid", weixin.getAppid());
            par.put("partnerid", weixin.getMch_id());
            par.put("prepayid", weixin.getPrepay_id());
            par.put("package", "Sign=WXPay");
            par.put("noncestr", weixin.getNonce_str());

            // 时间戳
            Date date = new Date();
            long time = date.getTime();
            // mysq 时间戳只有10位 要做处理
            String dateline = time + "";
            dateline = dateline.substring(0, 10);

            par.put("timestamp", dateline);

            String signnew = WXSignUtils.createSign("UTF-8", par);
            System.out.println("再次签名是：" + signnew);

            SetPay setPay = new SetPay();

            setPay.setAppid(weixin.getAppid());
            setPay.setPartnerid(weixin.getMch_id());
            setPay.setPrepayid(weixin.getPrepay_id());
            setPay.setNoncestr(weixin.getNonce_str());

            setPay.setTimestamp(dateline);
            setPay.setSign(signnew);
            setPay.setPack("Sign=WXPay");

            JSONObject js = JSONObject.fromObject(setPay);
            StringBuilder msg = new StringBuilder();
            msg.append("{\"code\":\"1\",");
            msg.append("\"msg\":\"查询成功！\",");
            msg.append("\"datas\":");
            msg.append(js.toString());
            msg.append("}");

            System.out.println(js);

            return msg.toString();
        }
        StringBuilder msg = new StringBuilder();
        msg.append("{\"code\":\"1\",");
        msg.append("\"msg\":\"查询成功！\",");
        msg.append("\"datas\":");
        msg.append("支付失败！");
        msg.append("}");

        return msg.toString();

    }
}
