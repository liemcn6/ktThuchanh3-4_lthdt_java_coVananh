/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String ma="";
        while(true){
            try{
              System.out.print("Nhap ma:");
              ma=in.nextLine();
              CheckInput.validateMa(ma);
              break;
            }catch(ValidateException e){
                System.err.println(e);
            }
        }
        String ns="";
        while(true){
            try{
              System.out.print("Nhap ngay sinh:");
              ns=in.nextLine();
              CheckInput.validateNgaySinh(ns);
              break;
            }catch(ValidateException e){
                System.err.println(e);
            }
        }
    }
}
