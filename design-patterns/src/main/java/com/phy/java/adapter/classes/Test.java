package com.phy.java.adapter.classes;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 10:24
 * @description：测试类
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        //以前的生产过程
        TraditionCar traditionCar = new TraditionCar();
        traditionCar.setEngine();
        traditionCar.setWheel();
        Car car = traditionCar.getCar();
        System.out.println(car.getDescription());

        //现在的生产过程
        AdapterByClass adapter =new AdapterByClass();
        adapter.setBattery();
        adapter.setWheel();
        Car car1 = adapter.getCar();
        System.out.println(car1.getDescription());
    }
}
