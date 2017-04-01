package com.oauth2.service;

import com.oauth2.exception.FormatException;
import com.oauth2.util.TokenGenerator;
import com.oauth2.vo.TokenRequestVo;
import com.oauth2.vo.TokenResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
@Service
public class TokenGetService {

    @Autowired
    TokenGenerator tokenGenerator;

    public TokenResultVo getToken(TokenRequestVo requestVo) throws FormatException {
        checkEmpty(requestVo);

        String client_id = requestVo.getClient_id();
        if(AuthorizationHolder.clientIdMap.keySet().contains(client_id)){
            if(requestVo.getCode().equals(AuthorizationHolder.clientIdMap.get(client_id))){
                return tokenGenerator.generate();
            }
        }

        return new TokenResultVo();
    }

    private void checkEmpty(TokenRequestVo requestVo) throws FormatException {
        if(StringUtils.isEmpty(requestVo.getClient_id())){
            throw new FormatException("client_id is empty");
        }
        if(StringUtils.isEmpty(requestVo.getRedirect_uri())){
            throw new FormatException("redirect_uri is empty");
        }
        if(StringUtils.isEmpty(requestVo.getCode())){
            throw new FormatException("code is empty");
        }
        if(StringUtils.isEmpty(requestVo.getGrant_type())){
            throw new FormatException("grant_type is empty");
        }
    }
}
