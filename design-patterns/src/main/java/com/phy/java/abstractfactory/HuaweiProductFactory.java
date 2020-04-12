package com.phy.java.abstractfactory;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 10:51
 * @description：
 * @modified By：
 * @version: $
 */
public class HuaweiProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产华为路由器");
        return new HuaweiRouter();
    }
}
