package com.telnet.prometheus.controller;

import com.telnet.prometheus.base.RestfulResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册接口
 * @author Ternura
 * @since 2020/10/3 19:48
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @ResponseBody
    @PostMapping("/normal")
    public RestfulResult<Boolean> normalRegister(@RequestParam("mobile") String mobile, @RequestParam("captcha") String captcha) {
        return RestfulResult.error(null);
    }
}
