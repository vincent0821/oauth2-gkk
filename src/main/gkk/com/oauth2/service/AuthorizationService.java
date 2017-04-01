package com.oauth2.service;

import com.oauth2.exception.FormatException;
import com.oauth2.vo.AuthorizationRequestVo;
import com.oauth2.vo.AuthorizationResponseVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
@Service
public class AuthorizationService {



    public AuthorizationResponseVo authorize(AuthorizationRequestVo requestVo) throws FormatException {
        checkEmpty(requestVo);

        //授权码模式
        if (requestVo.getResponse_type().equals("code")) {
            //如果系统内有这个id
            if (AuthorizationHolder.clientIdMap.keySet().contains(requestVo.getClient_id())) {
                //生成授权码
                AuthorizationResponseVo responseVo = new AuthorizationResponseVo();
                //与请求中的一致
                responseVo.setClient_id(requestVo.getClient_id());
                responseVo.setRedirect_url(requestVo.getRedirect_uri());
                responseVo.setState(requestVo.getState());
                //默认授权码模式的type
                responseVo.setGrant_type("authorization_code");
                //生成授权码，并存储在系统中
                String code = new Random().nextInt()+"";
                AuthorizationHolder.clientIdMap.put(requestVo.getClient_id(),code);
                responseVo.setCode(code);
                //返回
                return responseVo;
            }
        }
        //其余模式略

        return new AuthorizationResponseVo();
    }

    private void checkEmpty(AuthorizationRequestVo requestVo) throws FormatException {
        if (StringUtils.isEmpty(requestVo.getState())) {
            throw new FormatException("state is empty");
        }

        if (StringUtils.isEmpty(requestVo.getClient_id())) {
            throw new FormatException("client_id is empty");
        }

        if (StringUtils.isEmpty(requestVo.getRedirect_uri())) {
            throw new FormatException("redirect_uri is empty");
        }

        if (StringUtils.isEmpty(requestVo.getResponse_type())) {
            throw new FormatException("response_type is empty");
        }

        if (StringUtils.isEmpty(requestVo.getScope())) {
            throw new FormatException("scope is empty");
        }
    }


}
