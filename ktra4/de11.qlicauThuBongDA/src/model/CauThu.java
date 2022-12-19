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
public class CauThu implements Serializable{
    private int ma;
    private String ten,tuoi,ml;
    private static int sma=100;

    public CauThu() {
        ma=sma++;
    }

    public CauThu(int ma, String ten, String tuoi, String ml) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.ml = ml;
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

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }
    public  Object[] toObject(){
        return new Object[]{
          ma,ten,tuoi,ml  
        };
    }
}
