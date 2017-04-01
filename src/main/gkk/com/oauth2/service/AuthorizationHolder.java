package com.oauth2.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gongkuaikuai on 2017/4/1.
 * 作为数据源。
 * map中的键为clientId，值为授权code。
 */
public class AuthorizationHolder {
    static Map<String,String> clientIdMap = new HashMap<>();
    static {
        clientIdMap.put("2882303761517520186",null);
    }
}
