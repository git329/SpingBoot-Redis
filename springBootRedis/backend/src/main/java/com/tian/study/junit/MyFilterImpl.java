package com.tian.study.junit;

import java.io.File;

/**
 * @author tiayin
 * @date 2017/8/2
 */
public class MyFilterImpl implements Filter {
    @Override
    public boolean ignore() {
        return !new File("D:\test.txt").exists();
    }
}
