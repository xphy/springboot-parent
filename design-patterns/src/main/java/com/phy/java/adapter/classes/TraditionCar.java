package com.phy.java.adapter.classes;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 10:08
 * @description：传统汽车（源对象）
 * @modified By：
 * @version: $
 */
public class TraditionCar {
    protected Car car;
    //构造方法
    public TraditionCar(){
        car=new Car();
    }
    public void setEngine() {
        System.out.println("获取德国引擎");
        System.out.println("安装德国引擎");
        car.setDescription("引擎：德国造 ");
    }
    public void setWheel() {
        System.out.println("获取美国轮子");
        System.out.println("安装美国轮子");
        car.setDescription(car.getDescription()+"轮胎：美国造");
    }
    public Car getCar() {
        System.out.println("制造了一辆大众汽车");
        return car;
    }
}
