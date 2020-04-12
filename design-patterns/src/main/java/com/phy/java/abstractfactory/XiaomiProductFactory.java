package com.phy.java.abstractfactory;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 10:50
 * @description：
 * @modified By：
 * @version: $
 */
public class XiaomiProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiRouter();
    }
}
