package com.personal.skyAngel.comtroller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.skyAngel.comtroller.base.BaseController;
import com.personal.skyAngel.config.common.CommonAttributes;
import com.personal.skyAngel.config.request.base.BaseRequest;
import com.personal.skyAngel.config.response.base.ResponseMultiple;
import com.personal.skyAngel.domain.cost.Student;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController extends BaseController {

    /**
     * 查看幼儿
     *
     */
    @PostMapping("/getStudent")
    public @ResponseBody ResponseMultiple<Student> userRegist(@RequestBody BaseRequest request) {
        logger.info("用户注册--接口--开始 ： | start | request = {}", request);
        ResponseMultiple<Student> response = new ResponseMultiple<>();
        if (StringUtils.isEmpty(request.getUserName())
        /* || StringUtils.isEmpty(request.getIdCard()) */) {
            response.setCode(CommonAttributes.MISSING_REQUIRE_PARAM);
            response.setDesc("缺少必要请求参数");
            return response;
        }
        return null;
    }
}
