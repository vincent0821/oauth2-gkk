package com.testtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
