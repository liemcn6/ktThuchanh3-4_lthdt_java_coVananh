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
public class BTC implements Serializable{
    private CongNhan c;
    private SanPham s;
    private int sl;

    public BTC(CongNhan c, SanPham s, int sl) {
        this.c = c;
        this.s = s;
        this.sl = sl;
    }

    public BTC() {
    }

    public CongNhan getC() {
        return c;
    }

    public void setC(CongNhan c) {
        this.c = c;
    }

    public SanPham getS() {
        return s;
    }

    public void setS(SanPham s) {
        this.s = s;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    

    public  Object[] toObject(){
        return new Object[]{
         c.getMa(),c.getTen(),s.getMa(),sl
        };
    }
}
