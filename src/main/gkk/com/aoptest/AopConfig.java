package com.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
@Configuration
@ComponentScan("com.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {
}
