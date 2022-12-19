package bai;


import static java.lang.Thread.sleep;
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
public class Bai2 {
    public static void main(String[] args) {
        
        Timing1 t=new Timing1();
        t.setDaemon(true);
        t.start();
        CountDown t1=new CountDown(6);
        t1.start();
        
    }
}
class Timing1 extends Thread{
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
class CountDown extends Thread{
    private int num;
    public CountDown(int num){
        this.num=num;
    }
    public void run(){
        while(num>=0){
            System.out.println("\033[33m Count:"+num--);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
