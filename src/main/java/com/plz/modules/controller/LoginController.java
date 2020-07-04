package com.plz.modules.controller;

import com.plz.modules.model.Result;
import com.plz.modules.model.TUser;
import com.plz.modules.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginController
 * @Description: 登录接口
 * @Author: PANLVZ
 * @Date: 2020-03-13
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public Result Login(@RequestBody TUser tUser, HttpSession session) throws LoginException {
        TUser localUser = loginService.getLogin(tUser);
        if (localUser == null) {
            throw new LoginException("该用户不存在");
        }
        if (!localUser.getPassword().equals(tUser.getPassword())) {
            throw new LoginException("密码错误");
        }
        session.setAttribute("user", tUser);
        return Result.success("登录成功");
    }

}
