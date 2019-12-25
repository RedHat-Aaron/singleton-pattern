package com.athena.lazyPattern;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-双重检查加锁懒加载模式
 * @Date: Create in 4:01 PM 2019/11/24
 */
public class LazyDCLPattern {
    //1.私有化构造器
    private LazyDCLPattern() {
    }

    //2.提供存储字段(实际上这里会有指令重排许的问题，所以需要加volatitle关键字，但是这样也会影响性能)
    private static LazyDCLPattern lazyDCLPattern = null;

    //3.提供访问点
    public static LazyDCLPattern getInstance() {
        if (null == lazyDCLPattern) {
            synchronized (LazyDCLPattern.class) {
                if (null == lazyDCLPattern) {
                    lazyDCLPattern = new LazyDCLPattern();
                }
            }
        }
        return lazyDCLPattern;
    }
}
