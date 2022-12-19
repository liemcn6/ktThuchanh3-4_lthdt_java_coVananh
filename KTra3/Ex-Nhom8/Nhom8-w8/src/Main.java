
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) 
            throws ParseException{
        System.out.println("bt 1");
        int a,b;
        a=9;
        b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("ha noi toi");
            System.out.println(e);
        }
        System.out.println("Bt 2");
        System.out.println("BT 3");
    try{
    //unchecked 
    String num="9888";
    int n=Integer.parseInt(num);
    String dd="12/10/2020";
    SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
    
      Date d=f.parse(dd);
    //checked
    }catch(NumberFormatException e){
        System.out.println(e);
    
    
    //}catch(ParseException e){
        System.out.println(e);
    //}finally{
        System.out.println("luon thuc hien");
    //}
    }
    }
}
