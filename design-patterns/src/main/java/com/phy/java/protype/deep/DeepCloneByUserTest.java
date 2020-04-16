package com.phy.java.protype.deep;

import com.phy.java.protype.shallow.User;

import java.util.Date;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/14 15:35
 * @description：
 * @modified By：
 * @version: $
 */
public class DeepCloneByUserTest {
    public static void main(String[] args) {
        Date date =new Date(1234567890l);
        DeepCloneByUser user = new DeepCloneByUser();
        user.setName("原型深度拷贝");
        user.setAge(2020);
        user.setBirth(date);
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getBirth());
        try {
            //克隆对象
            DeepCloneByUser user1 =(DeepCloneByUser)user.clone();
            // 修改原型对象中的属性
            date.setTime(123231231231l);
            System.out.println(user.getBirth());
            // 修改参数
            user1.setName("dpb");
            System.out.println("-------克隆对象的属性-----");
            System.out.println(user1);
            System.out.println(user1.getName());
            System.out.println(user1.getBirth());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}