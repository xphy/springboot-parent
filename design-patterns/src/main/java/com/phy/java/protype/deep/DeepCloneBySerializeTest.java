package com.phy.java.protype.deep;

import com.phy.java.protype.shallow.User;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/14 16:22
 * @description：
 * @modified By：
 * @version: $
 */
public class DeepCloneBySerializeTest {
    public static void main(String[] args) throws CloneNotSupportedException, Exception {
        Date date =  new Date(1231231231231l);
        User user = new User();
        user.setName("波波烤鸭");
        user.setAge(18);
        user.setBirth(date);
        System.out.println("-----原型对象的属性------");
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getBirth());

        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(user);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        //克隆好的对象！
        User user1 = (User) ois.readObject();

        // 修改原型对象的值
        date.setTime(221321321321321l);
        System.out.println(user.getBirth());

        System.out.println("------克隆对象的属性-------");
        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user1.getBirth());
    }

}
