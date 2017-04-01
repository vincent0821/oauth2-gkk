package com.oauth2gkk.vo;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
public class TokenResultVo {

    private String access_token;
    private String expires_in;//过期时间
    private String refresh_token;
    private String mac_key;
    private String mac_algorithm;

    public TokenResultVo() {

    }

    public TokenResultVo(String access_token, String expires_in, String refresh_token, String mac_key, String mac_algorithm) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.refresh_token = refresh_token;
        this.mac_key = mac_key;
        this.mac_algorithm = mac_algorithm;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getMac_key() {
        return mac_key;
    }

    public void setMac_key(String mac_key) {
        this.mac_key = mac_key;
    }

    public String getMac_algorithm() {
        return mac_algorithm;
    }

    public void setMac_algorithm(String mac_algorithm) {
        this.mac_algorithm = mac_algorithm;
    }

    @Override
    public String toString() {
        return
                "access_token='" + access_token + '\'' +
                        ", expires_in='" + expires_in + '\'' +
                        ", refresh_token='" + refresh_token + '\'' +
                        ", mac_key='" + mac_key + '\'' +
                        ", mac_algorithm='" + mac_algorithm;
    }
}
