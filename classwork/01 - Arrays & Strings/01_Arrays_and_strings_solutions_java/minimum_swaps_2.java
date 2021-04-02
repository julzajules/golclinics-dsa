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
public class minimum_swaps_2 {
    
    public static void main(String[] args) {
        int swaps,arr_size = 0; // a variable to store the number of swaps and size of array
       
        Scanner s = new Scanner(System.in);
        System.out.println("What is the size of your array?");
        arr_size = s.nextInt(); //size of array
        
         int[] arr = new int[arr_size]; //declare array of specified size
         
         System.out.print("Please enter " + arr_size + " elements");

        for (int i = 0; i < arr_size; i ++) { //store elements in the array
            arr[i] = s.nextInt();
        }
        
        int temp_largest = 0;//temporarily store the largest element
        
        for (int i = 0; i < arr_size; i ++) { //traverse the array
            //if ( arr[i] > temp_largest) temp_largest = arr[i]; //compare array elements and store the largest in the variable temp_largest
            //if (arr[i] = temp_largest) & (arr[i+1] + 1 or arr[i+1] - 1 = arr[]]) 
            if(arr[i] > arr[i+1]){
                int for_swap = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= for_swap;
            }
        }   
        
        for( int j = 0; j <arr_size; j ++) {
            System.out.print(arr[j]);
        }
        

    }
}
