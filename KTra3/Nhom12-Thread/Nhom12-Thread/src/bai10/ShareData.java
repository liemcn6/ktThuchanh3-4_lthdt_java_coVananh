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
public class ShareData {
    int rad;
    int sum;
    int index;
    public ShareData() {
        sum = 0;
        index = 1;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public synchronized void sum(int value) {
        sum += value;
    }

    public synchronized boolean checkSum() {
        if (sum >= 200) {
            return false;
        }
        return true;
    }
}
