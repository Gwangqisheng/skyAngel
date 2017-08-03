package com.personal.skyAngel.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.skyAngel.config.common.CommonAttributes;
import com.personal.skyAngel.config.response.base.ResponseOne;
import com.personal.skyAngel.domain.base.CommonEnum;
import com.personal.skyAngel.domain.user.EndUser;
import com.personal.skyAngel.repository.EndUserRepository;
import com.personal.skyAngel.service.EndUserService;
import com.personal.skyAngel.service.impl.base.BaseServiceImpl;
import com.personal.skyAngel.utils.PasswordMD5SaltingUtils;

@Service
public class EndUserServiceImpl extends BaseServiceImpl implements EndUserService {

    @Autowired
    private EndUserRepository endUserRepository;

    /** 用户注册 */
    @Override
    public ResponseOne<EndUser> register(EndUser request) {
        ResponseOne<EndUser> response = new ResponseOne<>();
        String userId = UUID.randomUUID().toString();
        String password = PasswordMD5SaltingUtils.generate(request.getLoginPassword());
        request.setUserId(userId);
        request.setUserStatus(CommonEnum.UserStatus.ACTIVED);
        request.setLoginPassword(password);
        EndUser endUser = endUserRepository.save(request);
        logger.info("用户注册  | success | params = {}", endUser);
        response.setCode(CommonAttributes.SUCCESS);
        response.setDesc("请求成功");
        response.setMsg(endUser);
        return response;
    }

}
