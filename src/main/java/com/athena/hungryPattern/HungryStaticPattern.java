package com.athena.hungryPattern;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-静态代码块饿汉模式
 * @Date: Create in 3:46 PM 2019/11/24
 */
public class HungryStaticPattern {
    //1.私有化构造器
    private HungryStaticPattern() {
    }

    //2.存储单例对象字段
    private static final HungryStaticPattern hungryStaticPattern ;

    static {
        hungryStaticPattern = new HungryStaticPattern();
    }

    //3.提供获取点
    public static HungryStaticPattern getInstance() {
        return hungryStaticPattern;
    }
}
