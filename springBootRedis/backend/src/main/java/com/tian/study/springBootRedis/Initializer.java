package com.tian.study.springBootRedis;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * @author tiayin
 * @date 2017/8/1
 */
public class Initializer  extends AbstractHttpSessionApplicationInitializer {
    public Initializer(){
        super(Config.class);
    }
}
