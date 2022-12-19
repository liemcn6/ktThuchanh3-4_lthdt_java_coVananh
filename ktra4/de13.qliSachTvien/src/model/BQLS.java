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
public class BQLS implements Serializable{
    private Sach s;
    
    private KeSach k;
    private int sl;
    private String tt;

    public BQLS() {
    }

    public BQLS(Sach s, KeSach k, int sl, String tt) {
        this.s = s;
        this.k = k;
        this.sl = sl;
        this.tt = tt;
    }

    public Sach getS() {
        return s;
    }

    public void setS(Sach s) {
        this.s = s;
    }

    public KeSach getK() {
        return k;
    }

    public void setK(KeSach k) {
        this.k = k;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    
    public Object[] toObject(){
        return new Object[]{
          s.getMa(),s.getTen(),k.getMa(),sl,tt
        };
    }
}
