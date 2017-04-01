package com.oauth2.controller;

import com.oauth2.service.AuthorizationService;
import com.oauth2.vo.AuthorizationRequestVo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
@RestController
public class AuthorizationController {
    Logger log4j = Logger.getLogger(Autowired.class);

    @Autowired
    AuthorizationService authorizationService;

    @RequestMapping("/oauth/authorize/code")
    public String getAuthorization(HttpServletRequest request, HttpServletResponse response){
        log4j.info("1");

        //确定是否是许可的客户
        String client_id = request.getParameter("client_id");
        //需要重定向的客户页面
        String redirect_uri = request.getParameter("redirect_uri");
        //授权类型：默认是code，表示授权码类型
        String response_type = request.getParameter("response_type");
        //应用程序获得的授权级别，默认为read
        String scope = request.getParameter("scope");
        //表示客户端的当前状态，可以指定任意值，认证服务器会原封不动地返回这个值
        String state = request.getParameter("state");

        log4j.info("2");

        AuthorizationRequestVo requestVo = new AuthorizationRequestVo(client_id,redirect_uri,response_type,scope,state);

        return authorizationService.authorize(requestVo).toString();

    }

}