/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra3.bai11;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Data {
    Vector<Integer> v;
    private int index,num;
    private boolean running;

    public Data() {
        index = 1;
        running = true;
        v = new Vector<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    public void add(int num){
        v.add(num);
    }
    
}
