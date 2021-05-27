/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_arrays.strings;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class newyear_chaos {
    
    public static void main (String[] args) { 
        
            Scanner s = new Scanner(System.in);
    
            System.out.println("Enter number of test cases: ");
            int t = s.nextInt();
            
            System.out.print("Enter number of people in the queue: ");
            int p = s.nextInt();
            
            int[] f =new int[p];
            int r;
            
            for (int cases = 1; cases <= t; cases++) {
                System.out.print("Enter final order of the queue: ");
                    for(r = 0; r < p; r++) {
                        f[r] = s.nextInt();
                    }
                    
                    int y = f[r];
                    int x = f[r-1];
                    
                if (y > x) {
                    System.out.println("No bribe was made");
                } else {
                    
                    if(y - x == 1) {
                        System.out.println("1 ");
                    } else if (y - x == 2) {
                        System.out.println("2 ");
                    } else if (y - x > 2) {
                        System.out.println("Too chaotic");
                    }
                }
                
                
                
            }
    }
    
    
}
