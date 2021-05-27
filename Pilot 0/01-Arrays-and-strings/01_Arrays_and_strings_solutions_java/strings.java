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
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size = 0; // holds the size of the array
        int i,j, temp; // temp holds the values of the array temporarily during swapping
                
        Scanner s = new Scanner(System.in); //to allow user input from the keyboard
        
        System.out.println("Enter size of array: "); //prompt the user to input the size of the array
        size = s.nextInt(); // array's size from the user is stored in the variable called size
        
        int[] reverse = new int[size]; //declare the array called reverse of data type integer and of size size
        
        for(i=0; i<size; i++) {
            System.out.print("What are your array values?: "); //prompt user to input elements to be stored in the array
            reverse[i] = s.nextInt(); //stores input from the user in the array
        }
        
        System.out.print("The array values are: "); //prints the values stored in the array
        for(j =0; j <reverse.length; j++) {
            System.out.print( reverse[j] + ",");
        }
       
         j = i - 1; //points at the last element in the array
         i = 0; //points to the first element in the array
         
         //this code loops through the elements in the array, swapping their positions
         while (i < j) { //check while the value in i is before the value in j
             temp = reverse[i]; //move the first element to a temporary variable
             reverse[i] = reverse[j]; //move the last element to the position of the first element
             reverse[j] = temp; //move the first element from the temporary variable to the last position 
             i++; //moves to the second element
             j--; //moves to the second last element
         }
         
        System.out.print("The reverse array is: ");
        for(j =0; j <reverse.length; j++) {
            System.out.print( reverse[j] + ","); //print the array out again, this time the elements have already been swapped
        }
    }
    
}
