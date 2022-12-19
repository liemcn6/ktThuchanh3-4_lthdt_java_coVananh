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
public class Divide extends Thread{
    ShareData shareData;

    public Divide(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {

        while (shareData.checkSum()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndex() != 3 
                            && shareData.checkSum()) {
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 2 == 0) {
                    if (rad % 4 == 0) {
                        System.out.println(rad + " divisible by 4.");
                    } else {
                        System.out.println(rad + "not divisible by 4.");
                    }
                } else {
                    System.out.println(rad + "not divisible by 2");
                }
                System.out.println("Sum: " + shareData.getSum());
                shareData.setIndex(1);             // chạy lại luồng 1
            }

        }
        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
