/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

/**
 *
 * @author 000728303
 */
public class Queue {
    private final int[] values;
    private int head;
    private int tail;
    private int elem;
    
    public Queue(int size){
        values = new int[size];
    }
    
    public void append(int value){
        values[tail] = value;
        tail = (tail + 1) % values.length;
        elem++;
    }
    
    public int get(){
        int v = values[head];
        head = (head  +1) % values.length;
        elem--;
        return v;
    }
    
    public boolean isEmpty(){
        return elem == 0;
    }
    
    public boolean isFull(){
        return elem == values.length;
    }
}
