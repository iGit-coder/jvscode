package com.example.entities;

public class Hero {
    public String name;
    public float hp;//血量
    public float armor;//护甲
    public int moveSpeed;//移动速度

    public void isOk(){
        System.out.println("isOk...");
    }
    public static void isOkStatic(){
        System.out.println("isOkStatic...");
    }

}
