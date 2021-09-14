/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

import java.util.Scanner;

/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(100);
        int m = sc.nextInt();
        while (m != 0){
            
            queue.append(m);
            m = sc.nextInt();
        }
        while (!queue.isEmpty()){
            int p = queue.get();
            System.out.printf("Queue: %d%n",p);
        }
        
    }
}
