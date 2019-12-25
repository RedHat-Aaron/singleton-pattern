package com.athena.hungryPattern;

/**
 * @Author: xiaoxiang.zhang
 * @Description: 单例模式-标准饿汉模式
 * @Date: Create in 3:41 PM 2019/11/24
 */
public class HungryFormalPattern {

    //1.创建变量存储单例对象

    private static final HungryFormalPattern hungryPattern = new HungryFormalPattern();


    //2.私有化构造器

    private HungryFormalPattern() {
    }


    //3.提供一个获取方法

    public static HungryFormalPattern getInstance() {
        return hungryPattern;
    }
}
