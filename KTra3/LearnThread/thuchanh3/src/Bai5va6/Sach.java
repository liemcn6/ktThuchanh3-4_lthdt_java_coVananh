/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5va6;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Sach implements Serializable{
    private String ma,ten;
    private int soluong;
    private double dongia;
    private double tien;
    

    public Sach() {
    }

    public Sach(String ma, String ten, int soluong, double dongia) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
        
    }


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public Object[] toObject(){
        tien=dongia*soluong;
       return new Object[]{
            ma,ten,soluong,dongia,tien
        };
    }
}
