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
public class Tour implements Serializable{
    private int ma;
    private String kieu,tt,gia;
    private static int sma=1000;

    public Tour() {
        ma=sma++;
    }

    public Tour(int ma, String kieu, String tt, String gia) {
        this.ma = ma;
        this.kieu = kieu;
        this.tt = tt;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tour.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
          ma,kieu,tt,gia  
        };
    }
}
