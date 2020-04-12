package com.phy.java.singleton;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 11:51
 * @description：非线程安全的实现单例
 * @modified By：
 * @version: $
 */
public class NoSafetyLazySingleton {
    private static NoSafetyLazySingleton singleton;

    public NoSafetyLazySingleton() {
    }
    //getInstance()的返回值是一个对象的引用，并不是一个新的实例
    public static NoSafetyLazySingleton getInstance() {
        if (singleton == null) {
            singleton = new NoSafetyLazySingleton();
        }
        return singleton;
    }
}
