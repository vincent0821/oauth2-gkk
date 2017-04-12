package com.eventtest;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("我demoListner接受到了demoPublisher发布的消息："+ msg);
    }
}
