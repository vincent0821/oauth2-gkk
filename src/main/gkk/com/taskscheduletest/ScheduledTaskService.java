package com.taskscheduletest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 6 17 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定事件" + dateFormat.format(new Date()+"执行"));
    }
}
