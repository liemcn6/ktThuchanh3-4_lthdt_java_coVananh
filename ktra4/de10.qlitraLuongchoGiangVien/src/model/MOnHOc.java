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
public class MOnHOc implements Serializable{
    private int ma;
    private String ten;
    private int tst;
    private String lt,kp;
    private static int sma=100;

    public MOnHOc() {
        ma=sma++;
    }

    public MOnHOc(int ma, String ten, int tst, String lt, String kp) {
        this.ma = ma;
        this.ten = ten;
        this.tst = tst;
        this.lt = lt;
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

    public int getTst() {
        return tst;
    }

    public void setTst(int tst) {
        this.tst = tst;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
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
        MOnHOc.sma = sma;
    }
    public Object[] toObject(){
        return new  Object[]{
        ma,ten,tst,lt,kp    
        };
        
    }
    
}
