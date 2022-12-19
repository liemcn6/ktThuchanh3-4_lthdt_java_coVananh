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
public class DichVu implements Serializable{
    private int ma;
    private String ten,nhom,cp,gia;
    private static int sma=1000;

    public DichVu() {
        ma=sma++;
    }

    public DichVu(int ma, String ten, String nhom, String cp, String gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.cp = cp;
        this.gia = gia;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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
        DichVu.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,cp,gia
        };
    }
    
}
