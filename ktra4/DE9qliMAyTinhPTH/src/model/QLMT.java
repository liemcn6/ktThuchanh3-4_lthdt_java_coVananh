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
public class QLMT implements Serializable{
    private PTHucHanh p;
    private MAyTinh m;
    private int sl;
    private String tt;

    public QLMT() {
    }

    public QLMT(PTHucHanh p, MAyTinh m, int sl, String tt) {
        this.p = p;
        this.m = m;
        this.sl = sl;
        this.tt = tt;
    }

    public PTHucHanh getP() {
        return p;
    }

    public void setP(PTHucHanh p) {
        this.p = p;
    }

    public MAyTinh getM() {
        return m;
    }

    public void setM(MAyTinh m) {
        this.m = m;
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
           p.getMa(),p.getTen(),m.getMa(),sl,tt
        };
    }
}
