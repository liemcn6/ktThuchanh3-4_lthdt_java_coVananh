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
public class SanPham implements Serializable{
    private int ma;
    private String ten,dg;
    private static int sma=10000;

    public SanPham() {
        ma=sma++;
    }

    public SanPham(int ma, String ten, String dg) {
        this.ma = ma;
        this.ten = ten;
        this.dg = dg;
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

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SanPham.sma = sma;
    }

    
    
    public  Object[] toObject(){
        return new Object[]{
          ma,ten,dg
        };
    }
}
