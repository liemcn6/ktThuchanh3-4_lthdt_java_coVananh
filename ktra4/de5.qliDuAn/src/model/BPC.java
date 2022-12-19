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
public class BPC implements Serializable{
    private NhanVien n;
    private DuAn d;
    private int sn;
    private String vt;

    public BPC() {
    }

    public BPC(NhanVien n, DuAn d, int sn, String vt) {
        this.n = n;
        this.d = d;
        this.sn = sn;
        this.vt = vt;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public DuAn getD() {
        return d;
    }

    public void setD(DuAn d) {
        this.d = d;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getMa(),n.getTen(),d.getMa(),sn,vt
        };
    }
    
    
}
