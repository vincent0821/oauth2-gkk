package com.ioctest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by gongkuaikuai on 2017/4/11.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
    public int num;
}
