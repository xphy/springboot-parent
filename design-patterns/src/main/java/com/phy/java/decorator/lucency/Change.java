package com.phy.java.decorator.lucency;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/16 13:32
 * @description：抽象装饰角色“七十二变”
 * @modified By：
 * @version: $
 */
public class Change implements TheGreatestSage{
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
