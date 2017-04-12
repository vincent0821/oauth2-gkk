package com.eventtest;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.StandardContext;
import org.springframework.context.ApplicationEvent;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUid = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
