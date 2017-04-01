package com.oauth2.Exception;

/**
 * Created by gongkuaikuai on 2017/4/1.
 */
public class FormatException extends RuntimeException {
    public FormatException(){}

    public FormatException(String errorInfo){
        super(errorInfo);
    }
}
