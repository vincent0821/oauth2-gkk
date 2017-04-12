package com.eltest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
@Service
public class ElDemoService {
    @Value("其他类的属性")
    private String annother;

    public String getAnnother() {
        return annother;
    }

    public void setAnnother(String annother) {
        this.annother = annother;
    }
}
