package com.personal.skyAngel.config.request.base;

public class BaseRequest {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户token
     */
    private String token;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户手机号码
     *
     * @return
     */
    private String phoneNumber;

    /**
     * ID
     */
    private Long id;

    /**
     * 分页-页面大小
     */
    private Integer pageSize;
    /**
     * 分页-当前页码
     */
    private Integer pageNumber;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "patientRequest [userId=" + userId + ", token=" + token + ", userName=" + userName + ", id=" + id
                + ", pageSize=" + pageSize + ", pageNumber=" + pageNumber + ", phoneNumber=" + phoneNumber + "]";
    }

    /**
     * 用户登入
     *
     */
    // @PostMapping("/loginIn")
    // public @ResponseBody ResponseOne<EndUser> loginIn(@RequestBody EndUser request) {
    // ResponseOne<EndUser> response = new ResponseOne<>();
    // logger.info("用户登录--接口--开始 ： | start | request = {}", request);
    // if (StringUtils.isEmpty(request.getNickname()) || StringUtils.isEmpty(request.getLoginPassword())) {
    // response.setCode(CommonAttributes.MISSING_REQUIRE_PARAM);
    // response.setDesc("缺失必要请求参数");
    // return response;
    // }
    // EndUser endUser = endUserRepository.findByNickname(request.getNickname());
    // if (StringUtils.isEmpty(endUser)) {
    // response.setCode(CommonAttributes.FAILED);
    // response.setDesc("请求失败，该账户不存在");
    // return response;
    // }
    // String loginPassword = PasswordMD5SaltingUtils.generate(request.getLoginPassword());
    // if (loginPassword.equals(endUser.getLoginPassword())) {
    //
    // * UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(request.getNickname(),
    // * loginPassword); // Subject subject = SecurityUtils.getSubject(); // subject.logout(); //
    // * subject.login(usernamePasswordToken); // Session session = subject.getSession(true); // String jsessionId
    // * = (String) session.getId();
    //
    // response.setCode(CommonAttributes.SUCCESS);
    // response.setDesc("登录成功");
    // response.setMsg(endUser);
    // return response;
    // }
    // response.setCode(CommonAttributes.FAILED);
    // response.setDesc("登录失败，密码错误");
    // return response;
    // }

}
