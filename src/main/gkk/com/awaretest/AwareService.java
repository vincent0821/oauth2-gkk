package com.awaretest;

import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("bean的名称是：" + beanName);
        Resource resource = loader.getResource("classpath:com/awaretest/test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
