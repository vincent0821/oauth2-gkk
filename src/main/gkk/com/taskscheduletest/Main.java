package com.taskscheduletest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }
}
