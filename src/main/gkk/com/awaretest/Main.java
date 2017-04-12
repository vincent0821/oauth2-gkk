package com.awaretest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }
}
