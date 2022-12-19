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
public class BDTour implements Serializable{
    private KhachHang k;
    private Tour t;
    private String sn,nbd;
    //private static int sma=1000;

    public BDTour() {
       
    }

    public BDTour(KhachHang k, Tour t, String sn, String nbd) {
        this.k = k;
        this.t = t;
        this.sn = sn;
        this.nbd = nbd;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
    }

    public Tour getT() {
        return t;
    }

    public void setT(Tour t) {
        this.t = t;
    }

    public String getSn() {
        if(k.getKieu()=="ca nhan") return "1";
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getNbd() {
        return nbd;
    }

    public void setNbd(String nbd) {
        this.nbd = nbd;
    }

    

   

    public Object[] toObject(){
        return new Object[]{
          k.getMa(),k.getTen(),k.getKieu(),t.getMa(),t.getKieu(),sn,nbd
        };
    }
}
