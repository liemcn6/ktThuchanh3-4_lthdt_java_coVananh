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
public class Reader implements Serializable{
    private int ma;
    private String hoTen,diaChi,sdt;
    private static int sma=10000;

    public Reader() {
        ma=sma++;
    }

    public Reader(int ma, String hoTen, String diaChi, String sdt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Reader.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
          ma,hoTen,diaChi,sdt  
        };
    }
    
    
}

