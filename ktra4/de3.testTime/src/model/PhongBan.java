/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class PhongBan implements Serializable{
    private int ma;
    private String ten,mt,heSo;
    private static int sma=100;

    public PhongBan() {
        ma=sma++;
    }

    public PhongBan(int ma, String ten, String mt, String heSo) {
        this.ma = ma;
        this.ten = ten;
        this.mt = mt;
        this.heSo = heSo;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public String getHeSo() {
        return heSo;
    }

    public void setHeSo(String heSo) {
        this.heSo = heSo;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongBan.sma = sma;
    }
    public Object[] tObject(){
        return new Object[]{
            ma,ten,mt,heSo
        };
    }
    
}
