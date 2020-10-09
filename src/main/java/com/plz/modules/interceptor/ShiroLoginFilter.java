package com.plz.modules.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.plz.modules.model.Result;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: ShiroLoginFilter
 * @Description: shiro过滤器
 * @Author: PANLVZ
 * @Date: 2020/10/9
 */
public class ShiroLoginFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        //这里是个坑，如果不设置的接受的访问源，那么前端都会报跨域错误，因为这里还没到corsConfig里面
        httpServletResponse.setHeader("Access-Control-Allow-Origin", ((HttpServletRequest) request).getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        Result result = Result.error("401","请先登录");
        httpServletResponse.getWriter().write(JSONObject.toJSON(result).toString());
        return false;
    }
}
