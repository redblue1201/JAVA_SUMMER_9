package com.java.ex.main;

import com.java.ex.character.Priest;

public class MainClass {
    public static void main(String[] args) {
        Priest p1 = new Priest();
        Priest p2 = new Priest("반장",100,100,1,50,100,30);
        System.out.println(p1.getName() +"의 공격력 : " + p1.getDamage());
        System.out.println(p2.getName() +"의 공격력 : " + p2.getDamage());

        p1 = p2;
        System.out.println(p1.getName() +"의 공격력 : " + p1.getDamage());
        System.out.println(p2.getName() +"의 공격력 : " + p2.getDamage());

        p1.setName("병신");
        System.out.println(p2.getName() +"의 공격력 : " + p2.getDamage());

    }
}
