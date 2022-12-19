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
public class CongNhan implements Serializable{
    private int ma;
    private String ten,dc,casx;
    private static int sma=10000;

    public CongNhan() {
        ma=sma++;
    }

    public CongNhan(int ma, String ten, String dc, String casx) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.casx = casx;
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

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getCasx() {
        return casx;
    }

    public void setCasx(String casx) {
        this.casx = casx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public  Object[] toObject(){
        return new Object[]{
          ma,ten,dc,casx  
        };
    }
}
