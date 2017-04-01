package com.oauth2gkk.vo;

/**
 * Created by gongkuaikuai on 2017/4/1.
 * client_id ：应用程序的client ID，用于 API 识别应用程序。
 * redirect_uri ：获得授权码之后，服务提供商重定向用户代理（比如浏览器）的地址。
 * response_type ： 表明授权类型，默认是 code。即授权码模式。
 * scope： 应用程序可以获得的授权级别，默认值为 read。
 * state：表示客户端的当前状态，可以指定任意值，认证服务器会原封不动地返回这个值，用于抵御 CSRF 攻击。
 */
public class AuthorizationRequestVo {
    private String client_id;
    private String redirect_uri;
    private String response_type;
    private String scope;
    private String state;

    public AuthorizationRequestVo(String client_id, String redirect_uri, String response_type, String scope, String state) {
        this.client_id = client_id;
        this.redirect_uri = redirect_uri;
        this.response_type = response_type;
        this.scope = scope;
        this.state = state;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
