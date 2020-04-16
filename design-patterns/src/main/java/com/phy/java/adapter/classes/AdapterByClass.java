package com.phy.java.adapter.classes;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 10:20
 * @description：类的适配器模式 采用继承来实现
 * @modified By：
 * @version: $
 */
public class AdapterByClass extends TraditionCar implements FutureCar {
    @Override
    public void setBattery() {
        System.out.println("获取广州电池");
        System.out.println("安装广州电池");
        car.setDescription("电池：中国造");
    }
    public Car getCar(){
        System.out.println("特斯拉");
        return car;
    }

}
