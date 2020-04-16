package com.phy.java.decorator.lucency;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 13:35
 * @description：具体装饰角色“鸟儿”
 * @modified By：
 * @version: $
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
