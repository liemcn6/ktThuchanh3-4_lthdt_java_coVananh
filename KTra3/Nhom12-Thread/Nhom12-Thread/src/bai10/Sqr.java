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
public class Sqr extends Thread{
    ShareData shareData;

    public Sqr(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        while (shareData.checkSum()) {

            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndex() != 2 && 
                            shareData.checkSum()) {
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int rad = shareData.getRad();
                if (rad % 3 == 0) {
                    rad *= rad;
                    System.out.println("Sqr: " + rad);
                } else {
                    System.out.println(rad + "not divisible by 3.");
                }
                System.out.println("Sum: " + shareData.getSum());

                shareData.setIndex(1);          // chạy lại luồng 1
            }
        }
        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
