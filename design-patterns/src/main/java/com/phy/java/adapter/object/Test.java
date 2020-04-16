package com.phy.java.adapter.object;

import com.phy.java.adapter.classes.Car;
import com.phy.java.adapter.classes.TraditionCar;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 10:46
 * @description：
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
        AdapterByObject adapter =new AdapterByObject(traditionCar);
        adapter.setBattery();
        adapter.setWheel();
        Car car1 = adapter.getCar();
        System.out.println(car1.getDescription());
    }
}
