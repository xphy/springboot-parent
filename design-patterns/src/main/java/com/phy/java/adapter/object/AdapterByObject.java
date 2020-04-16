package com.phy.java.adapter.object;

import com.phy.java.adapter.classes.Car;
import com.phy.java.adapter.classes.FutureCar;
import com.phy.java.adapter.classes.TraditionCar;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 10:20
 * @description：对象的适配器模式，实现目标对象的所有接口
 * @modified By：
 * @version: $
 */
public class AdapterByObject  implements FutureCar {
    protected TraditionCar traditionCar;
    //对象通过构造器引入进来
    public AdapterByObject(TraditionCar traditionCar) {
        this.traditionCar = traditionCar;
    }

    @Override
    public void setBattery() {
        System.out.println("获取广州电池");
        System.out.println("安装广州电池");
        traditionCar.getCar().setDescription("电池：中国造");
    }
    @Override
    public void setWheel(){
        traditionCar.setWheel();
    }
    public Car getCar(){
        System.out.println("特斯拉");
        return traditionCar.getCar();
    }

}
