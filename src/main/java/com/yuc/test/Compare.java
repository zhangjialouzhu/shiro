package com.yuc.test;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        Hashtable<String,String> aa = new Hashtable<String, String>();
        aa.put(null,"");
        aa.put(null,"");
        List<Integer> a = new ArrayList<Integer>();
        String s1 = "yuc";
        String s2 = "yuc";
        String s3 = new String("yuc");
        Person p1 = new Person("19","u");
        Person p2 = new Person("19","u");
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        p1.canEat();


    }

}
class Person extends People{
    String age;
    String name;

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
