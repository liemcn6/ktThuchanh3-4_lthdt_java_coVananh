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
public class KhachHang implements Serializable{
    private int ma;
    private String ten, kieu;
    private static int sma=1000;

    public KhachHang() {
        ma=sma++;
    }

    public KhachHang(int ma, String ten, String kieu) {
        this.ma = ma;
        this.ten = ten;
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
        KhachHang.sma = sma;
    }

   

    public Object[] toObject(){
        return new Object[]{
          ma,ten,kieu 
        };
    }
}
