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
public class DSMH implements Serializable{
    private KhachHang k;
    private MatHang m;
    private int sl;

    public DSMH() {
    }

    public DSMH(KhachHang k, MatHang m, int sl) {
        this.k = k;
        this.m = m;
        this.sl = sl;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
    }

    public MatHang getM() {
        return m;
    }

    public void setM(MatHang m) {
        this.m = m;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
        return new Object[]{
          k.getMa(),k.getHt(),m.getMa(),m.getTen(),sl
        };
    }
}
