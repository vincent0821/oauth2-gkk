package com.taskexecutortest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            service.executeAsyncTask(i);
            service.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
