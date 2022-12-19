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
public class DSBH implements Serializable{
    private NhanVien n;
    private DichVu d;
    private int sl;

    public DSBH() {
    }

    public DSBH(NhanVien n, DichVu d, int sl) {
        this.n = n;
        this.d = d;
        this.sl = sl;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public DichVu getD() {
        return d;
    }

    public void setD(DichVu d) {
        this.d = d;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getMa(),n.getTen(),d.getMa(),d.getTen(),sl
        };
    }
}
