package com.athena.lazyPattern;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-懒加载静态内部类
 * @Date: Create in 4:08 PM 2019/11/24
 */
public class LazyStaticInnerClassPattern {


    private LazyStaticInnerClassPattern() {
        if (null != CreateSingleton.Lazy) {
            throw new RuntimeException("不能创建多个实例对象！");
        }
    }

    public static final LazyStaticInnerClassPattern getInstance() {
        return CreateSingleton.Lazy;
    }

    private static class CreateSingleton {
        private static final LazyStaticInnerClassPattern Lazy = new LazyStaticInnerClassPattern();
    }
}
