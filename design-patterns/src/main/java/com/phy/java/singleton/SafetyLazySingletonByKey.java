package com.phy.java.singleton;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 11:57
 * @description：线程安全实现单例利用synchronized关键字，缺点是效率低
 * @modified By：
 * @version: $
 */
public class SafetyLazySingletonByKey {
    private static SafetyLazySingletonByKey instance;
    private SafetyLazySingletonByKey(){}
    //饿汉式利用synchronized 关键字实现单例模式
    public static synchronized SafetyLazySingletonByKey getInstance() {
        if (instance == null) {
            //懒加载模式（懒汉式）用的时候在加载
            instance = new SafetyLazySingletonByKey();
        }
        return instance;
    }
}
