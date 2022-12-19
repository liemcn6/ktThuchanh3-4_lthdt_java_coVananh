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
    private CauThu c;
    private ViTRi v;
    private int stran;

    public BPC() {
    }

    public BPC(CauThu c, ViTRi v, int stran) {
        this.c = c;
        this.v = v;
        this.stran = stran;
    }

    public CauThu getC() {
        return c;
    }

    public void setC(CauThu c) {
        this.c = c;
    }

    public ViTRi getV() {
        return v;
    }

    public void setV(ViTRi v) {
        this.v = v;
    }

    public int getStran() {
        return stran;
    }

    public void setStran(int stran) {
        this.stran = stran;
    }

   
    public  Object[] toObject(){
        return new Object[]{
          c.getMa(),c.getTen(),v.getMa(),stran
        };
    }
}
