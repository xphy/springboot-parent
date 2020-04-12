package com.phy.java.factorymethod;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/11 15:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    //客户端代码只需要将相应的参数传入即可得到对象
    //用户不需要了解工厂类内部的逻辑。
    //缺点是新生成对象时，必须修改这个类
    public static void getBean(String type){
        Animal x = null ;
        if ( type.equals("dog")) {
            StaticFactory.getDog();
        }else if ( type.equals("cat")){
            x = StaticFactory.getCat();
        }else {
            x = StaticFactory.getRat();
        }
    }

    public static void main(String[] args) {
        getBean("dog");
    }
}
