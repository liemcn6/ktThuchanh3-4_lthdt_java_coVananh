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
public class Book implements Serializable{

    private int ma;
    private String tenSach,tacGia,linhVuc;
    private int nam,soLuong;
    private static int sma=10000;

    public Book() {
        ma=sma++;
    }

    public Book(int ma, String tenSach, String tacGia, 
            String linhVuc, int nam, int soLuong) {
        this.ma = ma;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.linhVuc = linhVuc;
        this.nam = nam;
        this.soLuong = soLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Book.sma = sma;
    }
   public Object[] toObject(){
       return new Object[]{
         ma,tenSach,tacGia,linhVuc,nam,soLuong  
       };
   } 
    
    
    
}
