/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleSum;

import java.util.Scanner;

/**
 *
 * @author imraan
 */
public class SimpleSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        
        System.out.print("Please enter your 1st value");
        int A = box.nextInt();
        
        System.out.print("Please enter your 2nd value");
        int B = box.nextInt();

        System.out.println("Multiplying values " + A + " and " + B + " is = to " + A*B);
    }
    
}
