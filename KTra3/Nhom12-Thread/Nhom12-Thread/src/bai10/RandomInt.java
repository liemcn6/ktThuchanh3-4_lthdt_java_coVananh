
package bai10;

import java.util.Random;


public class RandomInt extends Thread{
    private ShareData shareData;
    public RandomInt(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random = new Random();
        
        while (shareData.checkSum()) {
            synchronized (shareData) {
                int rad = random.nextInt(100) + 1;
                shareData.setRad(rad);
                System.out.println("\033[31m Rad: " + rad);
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                        
                shareData.sum(rad);

                if (rad % 3 == 0) {                  // nếu rad chia hết cho 3 thì luồng 2 đc chạy và luồng 3 k đc chạy
                    shareData.setIndex(2);
                } else {                              // nếu rad k chia hết cho 3 thì luồng 3 đc chạy
                    shareData.setIndex(3);
                }

                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
