package com.taskscheduletest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Configuration
@ComponentScan("com.taskscheduletest")
@EnableScheduling
public class TaskScheduleConfig {
}
