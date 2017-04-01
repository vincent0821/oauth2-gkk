package com.oauth2.vo;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
public class AuthorizationResponseVo {
    private String client_id;
    private String client_secret;
    private String grant_type;
    private String code;
    private String redirect_url;
    private String state;

    public AuthorizationResponseVo() {

    }

    public AuthorizationResponseVo(String client_id, String client_secret, String grant_type, String code, String redirect_url) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.grant_type = grant_type;
        this.code = code;
        this.redirect_url = redirect_url;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "client_id='" + client_id + '\'' +
                        ", client_secret='" + client_secret + '\'' +
                        ", grant_type='" + grant_type + '\'' +
                        ", code='" + code + '\'' +
                        ", redirect_url='" + redirect_url + '\'' +
                        ", state='" + state;
    }
}
