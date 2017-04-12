package com.annotationtest;

import org.springframework.stereotype.Service;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
