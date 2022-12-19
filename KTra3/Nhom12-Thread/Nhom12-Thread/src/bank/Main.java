
package bank;


public class Main {
    public static void main(String[] args) {
        Account a=new Account();
        Thread t1 = new Thread(){
            public void run() {
                a.withdraw(20000);
            }
             
        };         
        t1.start();  
        Thread t2 = new Thread(){
            public void run() {
                a.deposit(30000);
            }
        };
        t2.start();
    }
}
