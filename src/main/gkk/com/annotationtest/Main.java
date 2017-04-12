package com.annotationtest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        configApplicationContext.getBean(DemoService.class).outputResult();
        configApplicationContext.close();
    }
}
