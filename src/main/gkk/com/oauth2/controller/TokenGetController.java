package com.oauth2.controller;

import com.oauth2.service.TokenGetService;
import com.oauth2.vo.TokenRequestVo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
@RestController
public class TokenGetController {
    @Autowired
    TokenGetService tokenGetService;

    @RequestMapping(value = "/oauth/authorize/token")
    public String getToken(HttpServletRequest request){
        String grant_type = request.getParameter("grant_type");
        String client_id = request.getParameter("client_id");
        String redirect_uri = request.getParameter("redirect_uri");
        String code = request.getParameter("code");

        TokenRequestVo requestVo = new TokenRequestVo(grant_type,client_id,redirect_uri,code);

        return tokenGetService.getToken(requestVo).toString();
    }
}
