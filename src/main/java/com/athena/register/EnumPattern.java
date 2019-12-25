package com.athena.register;

/**
 * @Author: xiaoxiang.zhang
 * @Description:注册式单例-枚举式单例
 * @Date: Create in 5:33 PM 2019/11/24
 */
public enum EnumPattern {
    INTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumPattern getInstance() {
        return INTANCE;
    }
}
