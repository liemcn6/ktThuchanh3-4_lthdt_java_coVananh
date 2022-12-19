/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        List<MatHang> lhang=new ArrayList<>();
        lhang.add(new MatHang(125,"Thuoc rua chen",
                "gia dung", 123));
        lhang.add(new MatHang(567,"IPhone 13",
                "Dien tu", 12000000));
        IOFile.viet("src/object/hang.dat", lhang);
        List<KhachHang> lkhach=new ArrayList<>();
        lkhach.add(new KhachHang(122,"Tran an an",
                "so 3 lu duc","34238890"));
        lkhach.add(new KhachHang(678,"Lai thi Teo",
                "dinh cong","5643211"));
        IOFile.viet("src/object/khach.dat", lkhach);
        List<KhachHang> hh=IOFile.doc("src/object/khach.dat");
        for(KhachHang i:hh)
            System.out.println(i.toString());
    }
}
