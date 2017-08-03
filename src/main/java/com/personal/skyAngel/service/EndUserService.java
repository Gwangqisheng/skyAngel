package com.personal.skyAngel.service;

import com.personal.skyAngel.config.response.base.ResponseOne;
import com.personal.skyAngel.domain.user.EndUser;

public interface EndUserService {
    ResponseOne<EndUser> register(EndUser request);

}
