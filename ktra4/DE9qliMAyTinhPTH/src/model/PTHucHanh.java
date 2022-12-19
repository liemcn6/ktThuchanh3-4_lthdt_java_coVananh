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
public class PTHucHanh implements Serializable{
    private int ma;
    private String ten,sm;
    private static int sma=10000;

    public PTHucHanh() {
        ma=sma++;
    }

    public PTHucHanh(int ma, String ten, String sm) {
        this.ma = ma;
        this.ten = ten;
        this.sm = sm;
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

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PTHucHanh.sma = sma;
    }

   
    public Object[] toObject(){
        return new Object[]{
            ma,ten,sm
        };
    }
    
}
