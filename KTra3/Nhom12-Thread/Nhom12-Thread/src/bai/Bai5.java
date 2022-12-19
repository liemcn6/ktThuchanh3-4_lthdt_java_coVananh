package bai;

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
public class Bai5 {
    public static void main(String[] args) {
           Coloring t=new Coloring();
           t.start();
    }
}
class Coloring extends Thread{
    
    public void run(){
        Scanner in=new Scanner(System.in);
        //RED GREEN BLUE YELLOW
        
        while(true){
            boolean[] mau={false,false,false,false};    
            System.out.print("nhap mau:");
            String line=in.nextLine().toUpperCase();
            String[] c=line.split("\\s+");
            for (int i = 0; i < c.length; i++) {
                if(c[i].equals("RED"))
                    mau[0]=true;
                if(c[i].equals("GREEN"))
                    mau[1]=true;
                if(c[i].equals("BLUE"))
                    mau[2]=true;
                
                if(c[i].equals("YELLOW"))
                    mau[3]=true;
            }
            String[] chu={"\033[31m RED","\033[32m GREEN",
            "\033[34m BLUE","\033[33m YELLOW"};
            int index=0;
            for (int i = 0; i < 10; i++) {
                while(true){
                if(mau[index]){
                    System.out.println(chu[index]);
                    try{
                    sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                    if(index==3)
                    index=0;
                else
                    index++;
                    break;    
                }else{
                if(index==3)
                    index=0;
                else
                    index++;
                
                }
                }
                
                 
            }
        }
    }
}