package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setName("Pallab");
//     'name' has private access in 'com. driver. RWOnly'
//      System.out.println(rw.name);
        System.out.println(rw.getName());

    }
}