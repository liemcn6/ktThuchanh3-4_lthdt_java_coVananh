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
public class DuAn implements Serializable{
    private int ma;
    private String ten,kieu,kp;
    private static int sma=10000;

    public DuAn() {
        ma=sma++;
    }

    public DuAn(int ma, String ten, String kieu, String kp) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
        this.kp = kp;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DuAn.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,kieu,kp
        };
    }
}
