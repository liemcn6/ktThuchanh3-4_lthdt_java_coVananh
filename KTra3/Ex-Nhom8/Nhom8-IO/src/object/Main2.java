/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main2 {
    public static void main(String[] args) {
        List<MatHang> list=IOFile.doc("src/object/hang.dat");
         for(MatHang i:list)
             System.out.println(i.toString());
    }
}
