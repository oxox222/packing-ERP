package com.plz.modules.controller;

import com.plz.modules.model.Result;
import com.plz.modules.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @ClassName: LoginController
 * @Description: 登录接口
 * @Author: PANLVZ
 * @Date: 2020-03-13
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    /**
     * 登录
     * @param userName
     * @param password
     * @param session
     * @return
     * @throws LoginException
     */
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
            User info = postUser(user);
            return Result.success(info);
        } catch(Exception e) {
            e.printStackTrace();
            throw new LoginException(e.getMessage());
        }
    }

    /**
     * 登出
     * @return
     */
    @PostMapping("/logout")
    public Result Logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return Result.success(null);
    }

    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("/info")
    public Result getUserInfo() {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (Objects.isNull(user)) {
            return Result.success(null);
        }
        User info = postUser(user);
        return Result.success(info);
    }

    /**
     * 去除密码
     * @param user
     */
    private User postUser(User user) {
        User newUser = new User();
        BeanUtils.copyProperties(user, newUser, "password", "roles");
        return newUser;
    }

}
