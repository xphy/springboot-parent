package com.phy.java.factorymethod;


/**
 * @author ：mmzs
 * @date ：Created in 2020/4/11 10:30
 * @description：工厂类：静态类
 * @modified By：
 * @version: 1$
 */
public class StaticFactory {
    public StaticFactory() {
    }
    public static Animal getDog(){
        return new Dog();
    }
    public static Animal getCat(){
        return new Cat();
    }
    public static Animal getRat(){
        return new Rat();
    }
}
