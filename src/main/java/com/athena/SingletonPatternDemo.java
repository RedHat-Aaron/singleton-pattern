package com.athena;

import com.athena.register.ThreadLocalSingleton;

/**
 * @Author: xiaoxiang.zhang
 * @Description:单例模式示例类
 * @Date: Create in 3:53 PM 2019/11/24
 */
public class SingletonPatternDemo {
    /*public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        t1.start();
        Thread t2 = new Thread(new ExecutorThread());
        t2.start();
        System.out.println("Excutor End!!");
    }*/

    /*public static void main(String[] args) {
        try {
            //通过反射暴力创建对象（但是在当前的jdk1.8的版本中已经被修复了）
            Class<?> clazz = LazyStaticInnerClassPattern.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            Object o1 = clazz.newInstance();
            Object o2 = LazyStaticInnerClassPattern.getInstance();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        //通过序列化的方式来创建对象
        try {
            //1.先创建对象
            Object o1 = SerializableSingletonPattern.getInstance();
            //2.输出对象至硬盘
            FileOutputStream fileOut = new FileOutputStream(new File("/Users/xiangxz/object"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o1);
            out.close();
            //3.然后将对象读入缓存
            FileInputStream fileIn = new FileInputStream(new File("/Users/xiangxz/object"));
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object o2 = in.readObject();
            in.close();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
            System.out.println("Excutor End");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

   /* public static void main(String[] args) {
        //通过序列化的方式来创建对象
        try {
            //1.先创建对象
            EnumPattern o1 = EnumPattern.getInstance();
            //2.输出对象至硬盘
            FileOutputStream fileOut = new FileOutputStream(new File("/Users/xiangxz/object"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o1);
            out.close();
            //3.然后将对象读入缓存
            FileInputStream fileIn = new FileInputStream(new File("/Users/xiangxz/object"));
            ObjectInputStream in = new ObjectInputStream(fileIn);
            EnumPattern o2 = (EnumPattern)in.readObject();
            o2.setData(new Object());
            in.close();

            System.out.println(o1.getData());
            System.out.println(o2.getData());
            System.out.println(o1.getData() == o2.getData());
            System.out.println("Excutor End");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        t1.start();
        Thread t2 = new Thread(new ExecutorThread());
        t2.start();
        System.out.println("Excutor End!!");
    }*/

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();

    }
}
