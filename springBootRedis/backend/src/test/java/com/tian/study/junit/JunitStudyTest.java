package com.tian.study.junit;

import com.tian.study.junit.FilterRunner;
import com.tian.study.junit.MyFilterImpl;
import com.tian.study.junit.UsingFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.util.Assert;

/**
 * @author tiayin
 * @date 2017/8/2
 */
@RunWith(FilterRunner.class)
public class JunitStudyTest {
    @Test
    @UsingFilter(filter = MyFilterImpl.class)
    public void test() {
        Assert.isTrue(true);
    }

    @Test
    public void test1() {
        Assert.isTrue(true);
    }
}
