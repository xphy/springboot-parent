package com.phy.java.decorator.lucency;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 13:34
 * @description：具体装饰角色“鱼儿”
 * @modified By：
 * @version: $
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}
