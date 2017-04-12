package com.taskexecutortest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1：" + (i+1));
    }
}
