package com.phy.java.protype.shallow;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/13 9:45
 * @description：
 * @modified By：
 * @version: $
 */
public class User implements Cloneable, Serializable {
    private String name;

    private Date birth;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 实现克隆的方法
     */
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
