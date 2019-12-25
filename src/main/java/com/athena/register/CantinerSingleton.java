package com.athena.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式-容器式单例模式
 * @Date: Create in 11:23 PM 2019/11/24
 */
public class CantinerSingleton {
    private CantinerSingleton() {
    }

    private static final Map<String, Object> cantiner = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (cantiner) {
            Object obj = null;
            try {
                if (!cantiner.containsKey(className)) {
                    obj = Class.forName(className).newInstance();
                    cantiner.put(className, obj);
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return cantiner.get(className);
        }
    }
}
