package com.personal.skyAngel.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtils {

    private JsonUtils() {
        super();
    }

    /**
     * 将字符串转化成json对象
     * @param result
     * @return
     */
    public static JSONObject parseResult(String result) {
        JSONArray resultArray = JSON.parseArray(result);
        if (resultArray != null && resultArray.size() > 0) {
            return (JSONObject) resultArray.get(0);
        } else {
            return null;
        }
    }
}
