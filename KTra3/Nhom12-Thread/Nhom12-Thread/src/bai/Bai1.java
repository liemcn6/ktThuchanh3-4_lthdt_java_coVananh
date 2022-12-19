package bai;


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
public class Bai1 {
    public static void main(String[] args) {
        Timing t=new Timing();
        t.start();
        
        TimingCuCu r=new TimingCuCu();
        Thread t1=new Thread(r);
        t1.start();
    }
}
class Timing extends Thread{
    @Override
    public void run(){
        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
        while(true){
            System.out.println("\033[31m "+f.format(new Date()));
            try{
                sleep(1000);//milisecond
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class TimingCuCu implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\033[34m Cuc cu!!");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
