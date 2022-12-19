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
public class KHGD implements Serializable{
    private GiangVien g;
    private MOnHOc m;
    private int sl;

    public KHGD() {
    }

    public KHGD(GiangVien g, MOnHOc m, int sl) {
        this.g = g;
        this.m = m;
        this.sl = sl;
    }

    public GiangVien getG() {
        return g;
    }

    public void setG(GiangVien g) {
        this.g = g;
    }

    public MOnHOc getM() {
        return m;
    }

    public void setM(MOnHOc m) {
        this.m = m;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    

   
    public Object[] toObject(){
        return new  Object[]{
        g.getMa(),g.getTen(),m.getMa(),m.getTst(),sl
        };
        
    }
    
}
