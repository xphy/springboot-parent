package com.phy.java.protype.deep;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/14 16:07
 * @description：
 * @modified By：
 * @version: $
 */
public class DeepCloneByUser implements Cloneable, Serializable {
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
     * 深度克隆(deep clone)
     */
    public Object clone() throws CloneNotSupportedException{
        Object object = super.clone();
        // 实现深度克隆(deep clone)
        DeepCloneByUser user = (DeepCloneByUser)object;
        user.birth = (Date) this.birth.clone();
        return object;
    }
}
