/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {

        ShareData shareData = new ShareData();

        RandomInt randomInt = new RandomInt(shareData);
        Sqr sqr = new Sqr(shareData);
        Divide divide = new Divide(shareData);


        randomInt.start();
        sqr.start();
        divide.start();


    }
}
