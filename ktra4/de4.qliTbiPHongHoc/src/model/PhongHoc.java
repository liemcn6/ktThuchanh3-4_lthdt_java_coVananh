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
    private String ten,sg;
    private static int sma=10000;

    public PhongHoc() {
        ma=sma++;
    }

    public PhongHoc(int ma, String ten, String sg) {
        this.ma = ma;
        this.ten = ten;
        this.sg = sg;
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

    public String getSg() {
        return sg;
    }

    public void setSg(String sg) {
        this.sg = sg;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,sg
        };
    }
    
}
