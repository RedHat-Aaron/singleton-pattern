package com.athena.lazyPattern;

import java.io.Serializable;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-序列化类
 * @Date: Create in 4:08 PM 2019/11/24
 */
public class SerializableSingletonPattern implements Serializable {
    private SerializableSingletonPattern() {
    }

    private static final SerializableSingletonPattern INSTANCE = new SerializableSingletonPattern();

    public static SerializableSingletonPattern getInstance() {
        return INSTANCE;
    }

    public Object readResolve() {
        return INSTANCE;
    }
}
