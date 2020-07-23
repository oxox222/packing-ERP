package com.plz.modules.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @ClassName: CredentialsMatcher
 * @Description: 校验密码
 * @Author: PANLVZ
 * @Date: 2020/7/23
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //传入的密码
        String tokenPassword = new String(usernamePasswordToken.getPassword());
        //保存的密码
        String dbPassword = info.getCredentials().toString();
        return this.equals(tokenPassword, dbPassword);
    }
}
