package com.aoptest;

import org.springframework.stereotype.Service;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截器的add操作")
    public void add(){

    }
}
