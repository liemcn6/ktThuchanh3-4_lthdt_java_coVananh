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
public class PhongHoc implements Serializable{
    private int ma;
    private String ten;
    private int sg;
    private String kieu;
    private static int sma=10000;

    public PhongHoc() {
        ma=sma++;
    }

    public PhongHoc(int ma, String ten, int sg, String kieu) {
        this.ma = ma;
        this.ten = ten;
        this.sg = sg;
        this.kieu = kieu;
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

    public int getSg() {
        return sg;
    }

    public void setSg(int sg) {
        this.sg = sg;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,sg,kieu
        };
    }
}
