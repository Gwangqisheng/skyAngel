package com.personal.skyAngel.comtroller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.skyAngel.comtroller.base.MobileBaseController;
import com.personal.skyAngel.config.common.CommonAttributes;
import com.personal.skyAngel.config.request.base.BaseRequest;
import com.personal.skyAngel.config.response.base.ResponseOne;
import com.personal.skyAngel.domain.user.EndUser;
import com.personal.skyAngel.repository.EndUserRepository;
import com.personal.skyAngel.service.EndUserService;
import com.personal.skyAngel.utils.PasswordMD5SaltingUtils;

@RestController
@RequestMapping(value = "/endUser")
public class EndUserController extends MobileBaseController {

    @Autowired
    private EndUserService endUserService;

    @Autowired
    private EndUserRepository endUserRepository;

    /**
     * 管理员添加
     *
     */
    @PostMapping("/userRegist")
    public @ResponseBody ResponseOne<EndUser> userRegist(@RequestBody EndUser request) {
        logger.info("管理员添加--接口--开始 ： | start | request = {}", request);
        ResponseOne<EndUser> response = new ResponseOne<>();
        if (StringUtils.isEmpty(request.getNickname()) || StringUtils.isEmpty(request.getLoginPassword())) {
            response.setCode(CommonAttributes.MISSING_REQUIRE_PARAM);
            response.setDesc("缺少必要请求参数");
            return response;
        }
        return endUserService.register(request);
    }

    /**
     * 用户登入
     *
     */
    @PostMapping("/loginIn")
    public @ResponseBody ResponseOne<EndUser> loginIn(@RequestBody EndUser request) {
        ResponseOne<EndUser> response = new ResponseOne<>();
        logger.info("用户登录--接口--开始 ： | start | request = {}", request);
        if (StringUtils.isEmpty(request.getNickname()) || StringUtils.isEmpty(request.getLoginPassword())) {
            response.setCode(CommonAttributes.MISSING_REQUIRE_PARAM);
            response.setDesc("缺失必要请求参数");
            return response;
        }
        EndUser endUser = endUserRepository.findByNickname(request.getNickname());
        if (StringUtils.isEmpty(endUser)) {
            response.setCode(CommonAttributes.FAILED);
            response.setDesc("请求失败，该账户不存在");
            return response;
        }
        String loginPassword = PasswordMD5SaltingUtils.generate(request.getLoginPassword());
        if (loginPassword.equals(endUser.getLoginPassword())) {
            /*
             * UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(request.getNickname(),
             * loginPassword); // Subject subject = SecurityUtils.getSubject(); // subject.logout(); //
             * subject.login(usernamePasswordToken); // Session session = subject.getSession(true); // String jsessionId
             * = (String) session.getId();
             */
            response.setCode(CommonAttributes.SUCCESS);
            response.setDesc("登录成功");
            response.setMsg(endUser);
            return response;
        }
        response.setCode(CommonAttributes.FAILED);
        response.setDesc("登录失败，密码错误");
        return response;
    }

    /**
     * 用户登出
     *
     */
    @PostMapping("/loginOut")
    public @ResponseBody ResponseOne<EndUser> loginOut(@RequestBody BaseRequest request) {
        ResponseOne<EndUser> response = new ResponseOne<>();
        EndUser user = endUserRepository.findByUserId(request.getUserId());
        if (null != user) {
            // Subject subject = SecurityUtils.getSubject();
            // user.setJsessionId(null);
            // subject.logout();
            user.setModifyDate(new Date());
            endUserRepository.save(user);

            response.setCode(CommonAttributes.SUCCESS);
            response.setDesc("退出成功");
            return response;
        }
        response.setCode(CommonAttributes.FAILED);
        response.setDesc("退出失败");
        return response;
    }

}
