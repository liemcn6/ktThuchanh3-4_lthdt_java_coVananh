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
public class NhanVien implements Serializable{
    private int ma;
    private String ht,dc,sdt;
    private int bacLuong;
    private static int sma=1000;

    public NhanVien() {
        ma=sma++;
    }

    public NhanVien(int ma, String ht, String dc, String sdt, int bacLuong) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
        this.bacLuong = bacLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ht,dc,sdt,bacLuong
        };
    }
    
}
