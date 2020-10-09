package com.plz.modules.controller;

import com.plz.modules.model.Result;
import com.plz.modules.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginController
 * @Description: 登录接口
 * @Author: PANLVZ
 * @Date: 2020-03-13
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result Login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        HttpSession session) throws LoginException {
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            User user = (User) subject.getPrincipal();
            session.setAttribute("user", user);
            return Result.success("登录成功");
        } catch(Exception e) {
            e.getMessage();
            e.printStackTrace();
            throw new LoginException("登录失败");
        }
    }

}
