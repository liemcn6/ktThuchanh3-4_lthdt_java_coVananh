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
public class QLMS implements Serializable{
    private BanDoc b;
    private Sach s;
    private int sl;
    private String tt;

    public QLMS() {
    }

    public QLMS(BanDoc b, Sach s, int sl, String tt) {
        this.b = b;
        this.s = s;
        this.sl = sl;
        this.tt = tt;
    }

    public BanDoc getB() {
        return b;
    }

    public void setB(BanDoc b) {
        this.b = b;
    }

    public Sach getS() {
        return s;
    }

    public void setS(Sach s) {
        this.s = s;
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
            b.getMa(),b.getHt(),s.getMa(),sl,tt
        };
    }
    
}
