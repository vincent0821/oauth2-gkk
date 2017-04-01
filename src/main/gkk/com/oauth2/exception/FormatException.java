package com.oauth2.exception;

/**
 * 对请求参数做校验时，如果报错会抛出此异常。
 * Created by gongkuaikuai on 2017/4/1.
 */
public class FormatException extends Exception {
    public FormatException(){}

    public FormatException(String errorInfo){
        super(errorInfo);
    }
}
