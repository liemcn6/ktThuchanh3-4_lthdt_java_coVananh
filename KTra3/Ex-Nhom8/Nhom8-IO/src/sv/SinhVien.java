/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    private String ma,ten;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+tuoi;
    }
    
}
