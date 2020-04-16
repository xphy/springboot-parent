package com.phy.java.adapter.quesheng;

import com.phy.java.adapter.classes.Car;
import com.phy.java.adapter.classes.FutureCar;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 11:18
 * @description：默认适配器，实现了所有的接口
 * @modified By：
 * @version: $
 */
public class DefaultAdapter implements FutureCar {
    @Override
    public void setBattery() {
    }

    @Override
    public void setWheel() {

    }

    @Override
    public Car getCar() {
        return null;
    }
}
