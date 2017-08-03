package com.personal.skyAngel.config.common;

import java.io.Serializable;

/**
 * 系统设置
 *
 */
public class Setting implements Serializable {

    private static final long serialVersionUID = -1478999889661796840L;

    /** 缓存名称 */
    public static final String CACHE_NAME = "setting";

    /** 缓存Key */
    public static final Integer CACHE_KEY = 0;

    /** 分隔符 */
    @SuppressWarnings("unused")
    private static final String SEPARATOR = ",";

    /** 密码最大长度 */
    private Integer passwordMaxlength;

    /** 密码最小长度 */
    private Integer passwordMinlength;

    /** 登录名最大长度 */
    private Integer loginNameMaxLength;

    /** 登录名最小长度 */
    private Integer loginNameMinLength;

    /** 服务器端公钥 */
    private String serverPublicKey;

    /** 客户端公钥 */
    private String serverPrivateKey;

    /** 用户token过期时间 */
    private Integer tokenTimeOut;

    /** 用户名手机号正则表达式 */
    private String mobilePattern;

    /** 邮箱正则表达式 */
    private String emailPattern;

    /** 网站名称 */
    private String siteName;

    /** 网站地址 */
    private String siteUrl;

    public Integer getPasswordMaxlength() {
        return passwordMaxlength;
    }

    public void setPasswordMaxlength(Integer passwordMaxlength) {
        this.passwordMaxlength = passwordMaxlength;
    }

    public Integer getPasswordMinlength() {
        return passwordMinlength;
    }

    public void setPasswordMinlength(Integer passwordMinlength) {
        this.passwordMinlength = passwordMinlength;
    }

    public Integer getLoginNameMaxLength() {
        return loginNameMaxLength;
    }

    public void setLoginNameMaxLength(Integer loginNameMaxLength) {
        this.loginNameMaxLength = loginNameMaxLength;
    }

    public Integer getLoginNameMinLength() {
        return loginNameMinLength;
    }

    public void setLoginNameMinLength(Integer loginNameMinLength) {
        this.loginNameMinLength = loginNameMinLength;
    }

    public String getServerPublicKey() {
        return serverPublicKey;
    }

    public void setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }

    public String getServerPrivateKey() {
        return serverPrivateKey;
    }

    public void setServerPrivateKey(String serverPrivateKey) {
        this.serverPrivateKey = serverPrivateKey;
    }

    public Integer getTokenTimeOut() {
        return tokenTimeOut;
    }

    public void setTokenTimeOut(Integer tokenTimeOut) {
        this.tokenTimeOut = tokenTimeOut;
    }

    public String getMobilePattern() {
        return mobilePattern;
    }

    public void setMobilePattern(String mobilePattern) {
        this.mobilePattern = mobilePattern;
    }

    public String getEmailPattern() {
        return emailPattern;
    }

    public void setEmailPattern(String emailPattern) {
        this.emailPattern = emailPattern;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

}
