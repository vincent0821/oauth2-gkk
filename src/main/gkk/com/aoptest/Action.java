package com.aoptest;

import java.lang.annotation.*;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
