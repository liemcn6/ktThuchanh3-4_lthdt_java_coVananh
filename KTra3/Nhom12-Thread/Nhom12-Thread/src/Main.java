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
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Name:"+t.getName());
        System.out.println(t.getPriority());
    }
}
