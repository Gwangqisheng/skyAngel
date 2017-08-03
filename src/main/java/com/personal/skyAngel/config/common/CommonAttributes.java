package com.personal.skyAngel.config.common;

import java.util.Arrays;
import java.util.List;

/**
 * 公共参数
 */
public final class CommonAttributes {

    /**
     * 不可实例化
     */
    private CommonAttributes() {
    }

    /**
     * shiro GlobalSessionExpireMillis(单位为毫秒)
     */
    public static final Long SESSIONEXPIREMillis = (long) (86400000);
    // public static final long SESSIONEXPIREMillis = 60 * 1000;

    /**
     *
     */
    public static final List<String> PERMS = Arrays.asList("normal", "doctor", "admin", "clinic", "institution");

    /**
     * 对应数据库角色表
     */
    public static final String ADMIN = "admin";
    public static final String DOCTOR = "doctor";
    public static final String CLINICADMIN = "clinicAdmin";
    public static final String NORMAL = "normal";
    public static final String INSTITUTION = "institution";

    /** 日期格式配比 */
    public static final String[] DATE_PATTERNS = new String[] { "yyyy", "yyyy-MM", "yyyyMM", "yyyy/MM", "yyyy-MM-dd",
            "yyyyMMdd", "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss", "yyyy/MM/dd HH:mm:ss" };

    /** common-config.xml文件路径 */
    public static final String COMMON_CONFIG_XML_PATH = "/common-config.xml";

    public static final String URL_ENCODE = "UTF-8";

    /** common-config.properties文件路径 */
    public static final String COMMON_CONFIG_PROPERTIES_PATH = "/common-config.properties";

    /** token */
    public static final String API_TOKEN = "token";

    /** 存放paramMap的 DISTINCT_KEY */
    public static final String DISTINCT_KEY = "distinct";

    /** 存放调用登陆api后返回的token */
    public static final String API_TOKEN_SESSION = "tokenSession";

    /** user_id */
    public static final String API_USERID = "user_id";

    /** 找回密码时返回的token */
    public static final String PWD_TOKEN = "pwd_token";

    /** 存放调用登陆api后返回的user_id */
    public static final String API_USERID_SESSION = "userIdSession";

    /** 请求成功 */
    public static final String SUCCESS = "0000";

    /** 请求失败 */
    public static final String FAILURE = "9999";

    /** 参数异常 */
    public static final String PARAM_EXCEPTION = "8888";
    public static final String PARAM_EXCEPTIONMSG = "参数异常";

    /** 登录失败 (勿修改 ) */
    public static final String FAIL_LOGIN = "0001";
    public static final String FAIL_LOGINMSG = "登录失败";
    public static final String CURRENTUSERLOCKING = "所属诊所已被锁定";

    /** 注册失败 */
    public static final String FAIL_REG = "0002";

    /** 短信验证码相关操作失败 */
    public static final String FAIL_SMSTOKEN = "0003";

    /** Token 失效 */
    public static final String FAIL_TOKEN_TIMEOUT = "0004";

    /** 重置密码失败 */
    public static final String FAIL_RESET_PWD = "0005";

    /** 缺失必要参数 */
    public static final String MISSING_REQUIRE_PARAM = "0006";

    /** 请求参数无效 */
    public static final String FAIL_INAVAILABLE_PARAM = "0007";

    /** 手机号已存在 */
    public static final String FAIL_MOBILENUM_EXIST = "0008";

    /** 手机号格式错误 */
    public static final String FAIL_MOBILENUM_BAD_FORMAT = "0009";

    /** 操作失败 */
    public static final String SEND_EMAIL_SUCCESS = "0010";

    /** 操作失败 */
    public static final String SEND_EMAIL_FAILED = "0011";

    /** 邮箱格式错误 */
    public static final String FAIL_EMAIL_BAD_FORMAT = "0012";

    /** 新闻不存在 */
    public static final String FAIL_NEWS_NOT_EXIST = "0013";

    /** 新闻处于锁定状态 */
    public static final String FAIL_NEWS_LOCKED = "0014";

    /** 座机格式错误 */
    public static final String FAIL_PALNE_BAD_FORMAT = "0015";

    /** 两次输入密码不一致 */
    public static final String FAIL_PASSWORD_INCONFORMITY = "0016";

    /** 密码格式不匹配 */
    public static final String FAIL_PASSWORD_BAD_FORMAT = "0017";

    /** 医保状态错误 */
    public static final String FAIL_MEDICARE_STATUS_ERROR = "0018";

    /** 服务器String转换为Date异常，或客户端传递date格式不正确 */
    public static final String FAIL_DATEPARSE_ERROR = "0019";

    /** 未设置支付密码 */
    public static final String FAIL_PAY_WORD_NO_EXIST = "0020";

    /** 支付密码不正确 */
    public static final String FAIL_PAY_WORD_NOT_EQUALS = "0023";

    /** 余额不足 */
    public static final String FAIL_BALANCE_AMOUNT_NOT_ENOUGH = "0024";

    /** 已存在续保缴费订单，请勿重复添加 */
    public static final String FAIL_RENEWAL_MEDICARE_EXIST = "0021";

    /** 续保缴费已缴费 */
    public static final String FAIL_RENEWAL_MEDICARE_ALREADY_PAY = "0022";

    /** 手机号不存在 */
    public static final String FAIL_MOBILENUM_NOT_EXIST = "0025";

    /** 续保缴费记录已生成但是还未缴费 */
    public static final String FAIL_RENEWAL_MEDICARE_NOT_PAY = "0026";

    /** 用户时候优惠劵必须要绑定医保提示代码 */
    public static final String FAIL_USE_COUPON_WITHOUT_MEDICARE = "0027";

    /** 操作失败 */
    public static final String FAIL_COMMON = "1000";

    /** 没有取得任何信息 */
    public static final String FAIL_NO_INFO = "2000";

    /** 用户非法（禁用） */
    public static final String USER_INVALID = "3000";

    /** 已经绑定过的用户使用新手机再次注册去绑定的情况 */
    public static final String FAIL_EXSTING_MEDICARE_WITH_DIFFRENT_MOBILE = "0028";

    /** 医保信息不匹配需要上传身份证状态码 */
    public static final String FAIL_MEDICARE_NEED_ID_CARD_CHECKING = "0029";

    /** 医保信息不存在或者调用核心库接口错误 */
    public static final String FAIL_MEDICARE_NOT_EXIST_OR_ERROR = "0030";

    // -------------当前操作 未授权返回信息-------------
    public static final String UNAUTHORIZEDCODE = "0403";
    public static final String UNAUTHORIZEDMSG = "当前操作未授权";

    // -------------未登录和登录超时 返回信息------------
    public static final String UNLOGINORLLGINTimeOUTCODE = "0100";
    public static final String UNLOGINORLOGINTIMEOUTMSG = "未登录或登录超时";
    // -------------用户未注册(使用中)---------------
    public static final String UNKOWNUSERCODE = "0101";
    public static final String UNKOWNUSERMSG = "用户未注册";
    // ---------------用户名和密码不匹配---------------------
    public static final String USERNAMEANDPWDNOTMATCHCODE = "0102";
    public static final String USERNAMEANDPWDNOTMATCHMSG = "用户名和密码不匹配";
    // -------------有当前权限 返回信息------------
    public static final String AUTHORIZEDCODE = "0531";
    public static final String AUTHORIZEDMSG = "当前操作已授权";

    // -------------退出程序异常-----------------
    public static final String LOGOUTEXCEPTIONCODE = "0103";
    public static final String LOGOUTEXCEPTIONMSG = "程序退出出现异常";

    // ----- 如以上参数在各自模块中没有，则自己添加参数，格式为：" 模块名_常量名 = 编号 " -----//

    /** 原密码错误 */
    public static final String USER_OLD_PASSWORD_ERROR = "0104";
    public static final String USER_OLD_PASSWORD_ERROR_MSG = "原密码错误";

    /** 注册失败MSG */
    public static final String FAIL_REG_MSG = "注册失败";

    /** 注册成功MSG */
    public static final String REG_SUCCESS_MSG = "注册成功";

    /** 登录成功 */
    public static final String LOGIN_SUCCESS_MSG = "登录成功";

    /** 普通用户添加诊所成功 */
    public static final String USER_ADD_CLINIC_SUCCESS_MSG = "用户添加诊所成功";

    /** 请上传图片 */
    public static final String UPLOAD_PICTURE = "请上传图片";

    /** 删除诊所用户失败 */
    public static final String DELETE_CLINICUSER_FAIL_MSG = "删除诊所用户失败";

    /** 删除诊所用户成功 */
    public static final String DELETE_CLINICUSER_SUCCESS_MSG = "删除诊所用户成功";

    /** 添加 */
    public static final String USER_ADD_FAIL_MSG = "添加失败";

    /** 手机号已存在 */
    public static final String FAIL_MOBILENUM_EXIST_MSG = "手机号已存在";

    /** 手机号不符合规则 */
    public static final String MOBILENUM_NotSTANDARD_MSG = "手机号不符合规则";

    /** 找回密码成功 */
    public static final String RETRIEVE_PASSWORD_SUCCESS_MSG = "找回密码成功";

    /** 找回密码失败 */
    public static final String RETRIEVE_PASSWORD_FAIL_MSG = "找回密码失败";

    /** 密码格式不匹配 */
    public static final String FAIL_PASSWORD_BAD_FORMAT_MSG = "密码格式不匹配(长度需6-20位，至少包含数字和字母)";

    /** 更改失败 */
    public static final String UPDATE_FAIL = "更改失败";

    /** 查询失败 */
    public static final String QUERY_FAIL = "查询失败";

    /** 查询成功 */
    public static final String QUERY_SUCCESS = "查询成功";

    /** 删除成功 */
    public static final String REMOVE_SUCCESS = "删除成功";

    /** 更改成功 */
    public static final String UPDATE_SUCCESS = "更改成功";

    /** 保存成功 */
    public static final String SAVE_SUCCESS = "保存成功";

    /** 操作成功 */
    public static final String OPERATE_SUCCESS = "操作成功";

    /** 审核失败 */
    public static final String OPERATE_FAILURE = "审核失败";

    /** 请输入正确的手机号 */
    public static final String PHONE_NUM_ERR = "请输入正确的手机号";

    // ---患者 模块 自定义 code---
    /** 手机号已存在 */
    public static final String VERIFY_MEDICARE_TEL_NOT_MATCH = "1001";

    /** 身份证已存在 */
    public static final String FAIL_IDCARD_EXIST = "1002";

    /** 手机号和身份证不匹配 */
    public static final String VERIFY_MEDICARE_TEL_AND_ID_NOT_MATCH = "1003";
    /** 请求失败 */
    public static final String FAILED = "9999";// 请求失败

    /** 发送验证码失败msg */
    public static final String VERIFICATION_CODE_ERR_MSG = "请从新获取验证码";

    /** 发送验证码失败msg */
    public static final String VERIFICATION_CODE_SUCCESS_MSG = "发送验证码成功";

    // ----诊所模块----
    /** 上传文件是失败 */
    public static final String UPLOAD_FILE_FAILED = "上传文件失败";

    /** 上传文件成功 */
    public static final String UPLOAD_FILE_SUCCESS = "上传文件成功";

}
