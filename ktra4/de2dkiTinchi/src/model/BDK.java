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
public class BDK implements Serializable{
    private SinhVien s;
    private MonHoc m;
   
    private String ndk;

    public BDK() {
    }

    public BDK(SinhVien s, MonHoc m, String ndk) {
        this.s = s;
        this.m = m;
        this.ndk = ndk;
    }

    public SinhVien getS() {
        return s;
    }

    public void setS(SinhVien s) {
        this.s = s;
    }

    public MonHoc getM() {
        return m;
    }

    public void setM(MonHoc m) {
        this.m = m;
    }

    public String getNdk() {
        return ndk;
    }

    public void setNdk(String ndk) {
        this.ndk = ndk;
    }
    public Object[]  tObject(){
        return new Object[]{
          s.getMa(),s.getTen(),m.getMa(),ndk
        };
    }
    
    
}
