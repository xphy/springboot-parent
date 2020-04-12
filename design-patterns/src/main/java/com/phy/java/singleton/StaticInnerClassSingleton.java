package com.phy.java.singleton;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 12:31
 * @description：静态内部类实现单例模式
 * @modified By：
 * @version: $
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}

    private static class SingleTonHoler{
        private static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingleTonHoler.INSTANCE;
    }
}
