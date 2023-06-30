package com.java.ex.character;

public class Priest {
    private String name;
    private int hp;
    private int mp;
    private int level;
    private int intel;
    private int strng;
    private int agil;

    public Priest(String name , int hp , int mp , int level ,  int intel, int strng , int agil){
        this.name = name;
        this.agil = agil;
        this.hp = hp;
        this.intel = intel;
        this.mp = mp;
        this.level = level;
        this.strng = strng;
        System.out.println(this.name + "");
    }
    public Priest(){
        System.out.println("집가고 힐러가 생성되었습니다.");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setStrng(int strng) {
        this.strng = strng;
    }

    public void setAgil(int agil) {
        this.agil = agil;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getLevel() {
        return level;
    }

    public int getIntel() {
        return intel;
    }

    public int getStrng() {
        return strng;
    }

    public int getAgil() {
        return agil;
    }
    public int getDamage(){
        return ((intel * 3) + (strng*1) + (agil * 2))*level;
    }
}
