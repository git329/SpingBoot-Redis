package com.tian.study.junit;

import org.junit.runner.Runner;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author tiayin
 * @date 2017/8/2
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UsingFilter {
    Class<? extends Filter> filter();
    Class<? extends Runner> originalRunner() default BlockJUnit4ClassRunner.class;
}
