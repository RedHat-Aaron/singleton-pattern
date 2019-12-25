package com.athena.lazyPattern;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-懒加载简单模式
 * @Date: Create in 3:42 PM 2019/11/24
 */
public class LazySimplePattern {
    //1.私有化构造器
    private LazySimplePattern() {
    }

    //2.提供存储字段
    private static LazySimplePattern lazySimplePattern = null;

    //3.提供访问方法
    public static LazySimplePattern getInstance() {
        if (null == lazySimplePattern) {
            lazySimplePattern = new LazySimplePattern();
        }
        return lazySimplePattern;
    }
}
