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
public class BSX implements Serializable{
    private Lop l;
    private PhongHoc p;
    private int kip;

    public BSX() {
    }

    public BSX(Lop l, PhongHoc p, int kip) {
        this.l = l;
        this.p = p;
        this.kip = kip;
    }

    public Lop getL() {
        return l;
    }

    public void setL(Lop l) {
        this.l = l;
    }

    public PhongHoc getP() {
        return p;
    }

    public void setP(PhongHoc p) {
        this.p = p;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
     public Object[] toObject(){
        return new Object[]{
            l.getMa(),l.getTen(),p.getMa(),kip
        };
    }
}
