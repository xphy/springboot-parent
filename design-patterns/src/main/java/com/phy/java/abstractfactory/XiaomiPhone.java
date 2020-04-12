package com.phy.java.abstractfactory;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 10:16
 * @description：
 * @modified By：
 * @version: $
 */
public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callUp() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("用小米手机发短信");
    }
}
