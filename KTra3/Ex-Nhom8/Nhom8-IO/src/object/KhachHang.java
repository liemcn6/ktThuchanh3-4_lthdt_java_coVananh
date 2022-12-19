/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class KhachHang implements Serializable{
    //(mã KH, Họ tên, địa chỉ, Số ĐT
    private int ma;
    private String ten,dc,dt;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String dc, String dt) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.dt = dt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+dc+"\t"+dt;
    }
    
}
