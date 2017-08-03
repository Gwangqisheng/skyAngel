package com.personal.skyAngel.comtroller;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;

public class WePayCallBack {
    // 通知处理类
    @ResponseBody
    @RequestMapping(value = "/returnmsg.do", produces = "text/html;charset=UTF-8", method = { RequestMethod.POST })
    public String returnmsg(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 解析结果存储在HashMap
        Map<String, String> map = new HashMap<>();
        InputStream inputStream = request.getInputStream();

        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();

        // 遍历所有子节点
        for (Element e : elementList) {
            map.put(e.getName(), e.getText());
        }

        JSONObject json = JSONObject.fromObject(map);

        System.out.println("===消息通知的结果：" + json.toString() + "==========================");
        System.out.println("===return_code===" + map.get("return_code"));
        System.out.println("===return_msg===" + map.get("return_msg"));
        System.out.println("===out_trade_no===" + map.get("out_trade_no"));

        // 验证签名的过程

        // 判断是否支付成功
        if (map.get("return_code").equals("SUCCESS")) {

            /**
             * 支付成功之后的业务处理
             */

            // 释放资源
            inputStream.close();
            inputStream = null;

            // bis.close();
            return "SUCCESS";
        }
        if (map.get("return_code").equals("FAIL")) {

            /**
             * 支付失败后的业务处理
             */

            // 释放资源
            inputStream.close();

            inputStream = null;

            return "SUCCESS";
        }
        // 释放资源
        inputStream.close();
        inputStream = null;

        return "SUCCESS";
    }
}
