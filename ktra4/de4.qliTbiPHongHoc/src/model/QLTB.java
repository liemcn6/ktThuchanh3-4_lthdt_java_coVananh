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
public class QLTB implements Serializable{
    private ThietBi t;
    private PhongHoc p;
    private int sl;
    private String tt;

    public QLTB() {
    }

    public QLTB( PhongHoc p,ThietBi t, int sl, String tt) {
        this.t = t;
        this.p = p;
        this.sl = sl;
        this.tt = tt;
    }

    public ThietBi getT() {
        return t;
    }

    public void setT(ThietBi t) {
        this.t = t;
    }

    public PhongHoc getP() {
        return p;
    }

    public void setP(PhongHoc p) {
        this.p = p;
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
            p.getMa(),p.getTen(),t.getMa(),sl,tt
        };
    }
    
}
