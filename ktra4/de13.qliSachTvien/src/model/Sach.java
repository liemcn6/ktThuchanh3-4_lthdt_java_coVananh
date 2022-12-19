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
public class Sach implements Serializable{
    private int ma;
    private String ten,tg,cn,nxb;
    private static int sma=10000;

    public Sach() {
        ma=sma++;
    }

    public Sach(int ma, String ten, String tg, String cn, String nxb) {
        this.ma = ma;
        this.ten = ten;
        this.tg = tg;
        this.cn = cn;
        this.nxb = nxb;
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

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
          ma,ten,tg,cn,nxb
        };
    }
}
