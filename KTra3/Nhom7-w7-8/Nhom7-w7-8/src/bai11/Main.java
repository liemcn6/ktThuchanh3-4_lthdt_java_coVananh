/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        Thread3 t3 = new Thread3(data);
        t2.start();
        t3.start();
        t1.start();
    }
}
