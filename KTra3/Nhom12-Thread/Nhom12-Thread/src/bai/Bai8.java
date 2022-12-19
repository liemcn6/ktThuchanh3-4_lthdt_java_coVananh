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
public class Bai8 {
    public static void main(String[] args) {
        
        Timing2 t1=new Timing2(5);
        t1.setName("Time");
        
        Dog t2=new Dog(5);
        t2.setName("Dog");
        t1.start();
        
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        Person t3=new Person(5);
        t3.setName("Person");
        t3.start();
        
    }
}
class Timing2 extends Thread{
    private int num;
    public Timing2(int num){
        this.num=num;
    }public void run(){
    SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
            for (int i = 0; i < num; i++) {
            System.out.println("\033[31m "+this.getName()+":"+f.format(new Date()));
            try{
                sleep(1000);//milisecond
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
}
}
class Dog extends Thread{
    private int num;
    public Dog(int num){
        this.num=num;
    }
    public void run(){
            for (int i = 0; i < num; i++) {
            System.out.println(this.getName()+":"+"\033[33m Watching!!!");
            try{
                sleep(1000);//milisecond
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
            System.out.println(this.getName()+":"+"\033[31m Go GO Go");
}
}
class Person extends Thread{
    private int num;
    public Person(int num){
        this.num=num;
    }
    public void run(){
        int n=10;
        System.out.println(this.getName()+":"+": WOW big dog!");
            for (int i = 0; i < num; i++) {
            System.out.println(this.getName()+":"+"\033[35m "+n);
            n+=10;
            try{
                sleep(1000);//milisecond
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
            
}
}
