package com.personal.skyAngel.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

public class UserVerifyUtils {

    /**
     * 验证手机号
     * @param phoneNumber 手机号
     * @return 真、假(是否为手机号)
     */
    public static boolean isMobilePhone(String phoneNumber){
        if (phoneNumber == null) {
            return false;
        }
        //String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        String regExp = "^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-9])|(14[0-9])|(16[0-9]))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    /**
     * 验证登陆密码
     * @param password 密码
     * @return 真、假(密码是否符合规则)
     *
     */
    public static boolean isEligiblePassword(String password){
    	if (StringUtils.isEmpty(password)) {
			return false;
		}
    	String reqExp = "(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{6,20}$";
    	Pattern p = Pattern.compile(reqExp);
    	Matcher m = p.matcher(password);
    	return m.matches();
    }

    /**
     * 获取四位验证码
     * @return
     */
    public static String getVerifyCode() {
    	int verifyCode = 1010;
        verifyCode = new Random().nextInt(9999-1000+1)+1000;
    	return String.valueOf(verifyCode);
    }

}
