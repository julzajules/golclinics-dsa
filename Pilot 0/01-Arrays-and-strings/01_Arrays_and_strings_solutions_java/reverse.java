
//import all librabries in the java.util package
import java.util.*;

//implementation 2
public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("What is the size of your array?"); //prompt user to enter the size of the array
        int size_A = scan.nextInt(); //size_A is the variable that holds teh size of the array
        int[] A = new int[size_A]; // declare your array
        System.out.print("Enter array element");  //prompt user to enter the elements of the array
        for (int i = 0; i < size_A; i++) {
            A[i] = scan.nextInt();
        }
        int start = 0;
        int end = size_A - 1;
        while (start < end){
            int temp = A[start];
            A[start++] = A[end];
            A[end--] = temp;
        }
        for(int j = 0; j <= size_A-1;j ++) {
            System.out.print(A[j]);
        }
    }
}