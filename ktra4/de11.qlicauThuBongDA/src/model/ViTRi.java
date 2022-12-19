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
public class ViTRi implements Serializable{
    private int ma;
    private String ten,mt;
    private static int sma=100;

    public ViTRi() {
        ma=sma++;
    }

    public ViTRi(int ma, String ten, String mt) {
        this.ma = ma;
        this.ten = ten;
        this.mt = mt;
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

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTRi.sma = sma;
    }

    
    public  Object[] toObject(){
        return new Object[]{
          ma,ten,mt 
        };
    }
}
