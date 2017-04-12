package com.beantest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }

}
