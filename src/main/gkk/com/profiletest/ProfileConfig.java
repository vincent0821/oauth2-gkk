package com.profiletest;

import com.aoptest.DemoAnnotationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
