package com.personal.skyAngel.domain.base;

/**
 * 公共枚举类
 *
 * @author peng.yan
 *
 */
public class CommonEnum {

    /**
     * 性别 author qisheng.wang
     *
     */
    public enum Sex {
        /** 男 */
        MALE,
        /** 女 */
        FEMALE
    }

    /**
     * 用户状态
     */
    public enum UserStatus {
        /** 正常 */
        ACTIVED,
        /** 锁定 */
        LOCKED,
        /** 异常 */
        EXCEPTION
    }

    /**
     * 缴费状态
     */
    public enum PaymentStatus {
        /** 未缴费 */
        UNPAID,
        /** 已缴费 */
        PAID,
        /** 部分缴费 */
        PARTIAL;
    }

    /**
     * 缴费方式
     */
    public enum PaymentType {
        /** 现金收讫 */
        CASH,
        /** 微信 */
        WEPAY,
        /** 支付宝 */
        ALIPAY,
        /** 银联 */
        UNIONPAY;

    }
}
