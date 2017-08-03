package com.personal.skyAngel.comtroller.base;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.personal.skyAngel.config.common.Setting;
import com.personal.skyAngel.utils.SettingUtils;

public class MobileBaseController extends BaseController {

    public Setting setting = SettingUtils.get();

    public boolean isMobileNumber(String mobile) {
        Pattern p = Pattern.compile(setting.getMobilePattern());
        Matcher m = p.matcher(mobile);
        return m.matches();
    }

    /**
     * 邮箱格式验证
     *
     * @param email
     * @return
     */
    public boolean isEmail(String email) {
        Pattern regex = Pattern.compile(setting.getEmailPattern());
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }

    protected JSONObject parseResult(String result) {
        JSONArray resultArray = JSON.parseArray(result);
        if (resultArray != null && resultArray.size() > 0) {
            return (JSONObject) resultArray.get(0);
        } else {
            return null;
        }
    }

    protected Boolean isSaveRecordData(Integer year, Integer month) {
        // 如果查询年月小于当前年月，则保存数据到本地
        Calendar calendar = Calendar.getInstance();
        Integer nowYear = calendar.get(Calendar.YEAR);
        Integer nowMonth = calendar.get(Calendar.MONTH) + 1;
        if ((year.equals(nowYear) && month < nowMonth) || (year < nowYear)) {
            return true;
        } else {
            return false;
        }
    }

}
