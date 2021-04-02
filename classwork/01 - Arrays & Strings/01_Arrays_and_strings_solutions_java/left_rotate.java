
import java.util.*;
import java.util.Scanner;

//the left rotation operation on the array shifts elements 1 unit to the left
//having the lowest index move to the highest index is called circular array

public class left_rotate {
    
          public static void main(String[] args) {
        
                    int arr_size,rots;
                    int j,i = 0;
                    int d = 2; // hold the number of left rotations to be made
                    int temp = 0; //hold the value in the last index and that in the first index
        
                    Scanner s = new Scanner(System.in);
        
                    System.out.println("Enter size of your array: ");
                    arr_size = s.nextInt();
                    
                    System.out.print("Enter number of rotations: ");
                    rots = s.nextInt();
        
                    int[] a = new int[arr_size]; //declare an array of size defined by user
         
                    for(int h = 0; h < a.length; h ++) {
                               System.out.print("Enter array elements: ");
                               a[h] = s.nextInt();
                    }
                    
                    j = rots;
                    
                    while (i<j) {
                               temp = a[i];
                               a[i] = a[j];
                               a[j] = temp;
                               i++;
                               j--;
                    }
                    
                    System.out.println("Your array is: ");
                    for (int f = 0; f <a.length; f ++) {
                        System.out.print(a[f]);
                    }
        
    }
}
