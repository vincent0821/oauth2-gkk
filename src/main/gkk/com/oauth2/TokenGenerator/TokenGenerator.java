package com.oauth2.TokenGenerator;

import com.oauth2.vo.TokenResultVo;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
@Component
public class TokenGenerator {
    public TokenResultVo generate(){
        TokenResultVo vo = new TokenResultVo();
        vo.setAccess_token("accesstoken"+new Random().nextInt());
        vo.setExpires_in(""+1497628646);
        vo.setMac_algorithm("hmac-sha-1");
        vo.setMac_key("mac_key"+new Random().nextInt());
        vo.setRefresh_token("refresh token");
        return vo;
    }
}
