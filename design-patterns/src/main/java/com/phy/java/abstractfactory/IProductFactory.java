package com.phy.java.abstractfactory;

/**
 * 这个是生产对象的工厂，面向接口编程
 */

public interface IProductFactory {
    /**
     * 生产手机
     * @return
     */
    IPhoneProduct produceTelPhone();

    /**
     * 生产路由器
     * @return
     */
    IRouterProduct produceRouter();
}
