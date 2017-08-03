package com.personal.skyAngel.domain.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.CommonEnum.UserStatus;
import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "end_user")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "end_user_sequence")
public class EndUser extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用戶ID
     */
    private String userId;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 登录名（登录账号）
     */
    private String loginName;

    /**
     * 显示昵称
     */
    private String nickname;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 新密码
     */
    @Transient
    private String newPassword;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 错误登录次数（超过三次将锁定）
     */
    private Integer loginErrorNumber;

    /**
     * 用户状态： 0：正常 ACTIVED， 1：锁定 LOCKED， 2：异常 EXCEPTION
     */
    private UserStatus userStatus;

    /**
     * 头像
     */
    private String icon;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生年月
     */
    private String birthday;

    /**
     * 地址
     */
    private String address;

    public EndUser() {
    }

    public EndUser(String userId, String mobile, String idCard, String loginName, String nickname, String loginPassword,
            String newPassword, Date lastLoginTime, Integer loginErrorNumber, UserStatus userStatus, String icon,
            String name, String sex, Integer age, String birthday, String address) {
        super();
        this.userId = userId;
        this.mobile = mobile;
        this.idCard = idCard;
        this.loginName = loginName;
        this.nickname = nickname;
        this.loginPassword = loginPassword;
        this.newPassword = newPassword;
        this.lastLoginTime = lastLoginTime;
        this.loginErrorNumber = loginErrorNumber;
        this.userStatus = userStatus;
        this.icon = icon;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    @JsonProperty
    @Column(nullable = true, unique = true)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty
    @Column()
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @JsonProperty
    @Column(nullable = true)
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Transient
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @JsonProperty
    @Column()
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @JsonProperty
    public Integer getLoginErrorNumber() {
        return loginErrorNumber;
    }

    public void setLoginErrorNumber(Integer loginErrorNumber) {
        this.loginErrorNumber = loginErrorNumber;
    }

    @JsonProperty
    @Column(nullable = true)
    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    @JsonProperty
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonProperty
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @JsonProperty
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @JsonProperty
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
