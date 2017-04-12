package com.conditiontest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        System.out.println(configApplicationContext.getBean(ListService.class).showListCmd());
    }
}
