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
public class MonHoc implements Serializable{
    private int ma;
    private String ten;
    private int tt;
    private String loai;
    private static int sma=100;

    public MonHoc() {
        ma=sma++;
    }

    public MonHoc(int ma, String ten, int tt, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.tt = tt;
        this.loai = loai;
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

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tt,loai
        };
    }
    
}
