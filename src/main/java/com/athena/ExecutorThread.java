package com.athena;

import com.athena.lazyPattern.LazyDCLPattern;
import com.athena.register.CantinerSingleton;
import com.athena.register.ThreadLocalSingleton;

/**
 * @Author: xiaoxiang.zhang
 * @Description:线程执行器
 * @Date: Create in 3:56 PM 2019/11/24
 */
public class ExecutorThread implements Runnable {
    public void run() {
        //LazySimplePattern lazyPattern = LazySimplePattern.getInstance();
        //LazyDCLPattern lazyPattern = LazyDCLPattern.getInstance();
        /*CantinerSingleton cantiner = (CantinerSingleton) CantinerSingleton.getBean("com.athena.register.CantinerSingleton");*/
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
