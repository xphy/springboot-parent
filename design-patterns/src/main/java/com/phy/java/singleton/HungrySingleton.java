package com.phy.java.singleton;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 12:11
 * @description：武汉模式不存在线程安全
 * @modified By：
 * @version: $
 */
public class HungrySingleton {
    // 立即加载方式==饿汉模式(空间换时间)
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其它实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全问题
        return singleton;
    }
}
