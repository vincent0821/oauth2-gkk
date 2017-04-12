package com.main;

import com.aoptest.AopConfig;
import com.aoptest.DemoAnnotationService;
import com.aoptest.DemoMethodService;
import com.beantest.BeanWayService;
import com.beantest.JSR250WayService;
import com.beantest.PrePostConfig;
import com.eltest.ELConfig;
import com.eventtest.DemoPublisher;
import com.eventtest.EventConfig;
import com.ioctest.DemoPrototypeService;
import com.ioctest.DemoSingletonService;
import com.ioctest.IocConfig;
import com.profiletest.DemoBean;
import com.profiletest.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("hello application event");
        context.close();
    }

    private static void testProfile() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.getEnvironment().setActiveProfiles("dev");
        configApplicationContext.register(ProfileConfig.class);
        configApplicationContext.refresh();

        DemoBean demoBean = configApplicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        configApplicationContext.close();
    }

    private static void testPrePost() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        context.close();
    }

    private static void testEL() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.outputResource();
        context.close();
    }

    private static void testIocPrototype() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        DemoPrototypeService service = context.getBean(DemoPrototypeService.class);
        service.num++;
        DemoPrototypeService service1 = context.getBean(DemoPrototypeService.class);
        System.out.println(service1.num);
    }

    private static void testIocSingleton() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
        singletonService.num++;
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
        System.out.println(singletonService2.num);
    }

    void testAop(){
        System.out.println(1);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
        System.out.println(2);
    }
}
