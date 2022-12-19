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
public class DSCC implements Serializable{
    private NhanVien n;
    private PhongBan p;
    private int sn;

    public DSCC() {
    }

    public DSCC(NhanVien n, PhongBan p, int sn) {
        this.n = n;
        this.p = p;
        this.sn = sn;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public PhongBan getP() {
        return p;
    }

    public void setP(PhongBan p) {
        this.p = p;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getMa(),n.getHt(),p.getMa(),p.getTen(),sn
        };
    }
}
