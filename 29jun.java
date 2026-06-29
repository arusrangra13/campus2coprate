// create an array 5 intigers ,fill all 5 integers after taking input from user ,if 5 integer filled-make an new 
             // array of size 10 and shift all the old data into new array, Util user is not entering-1

import java.util.Scanner;

public class Static {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int capacity = 5; // Initial size
        int count = 0;    // Number of elements currently filled
        
        // Step 1: Create initial array of size 5
        int[] arr = new int[capacity];
        
        System.out.println("Enter integers (Enter -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            
            // Break condition
            if (input == -1) {
                break;
            }
            
            // Step 2: Check if the array is full
            if (count == capacity) {
                int newCapacity = capacity * 2; // Double the size (5 -> 10, 10 -> 20, etc.)
                int[] newArr = new int[newCapacity]; // Create the larger array
                
                // Step 3: Shift all old data into the new array
                for (int i = 0; i < capacity; i++) {
                    newArr[i] = arr[i];
                }
                
                // Point our main array reference to the new array
                arr = newArr;
                capacity = newCapacity;
                
                System.out.println("--> Array full! Resized capacity to " + capacity);
            }
            
            // Insert the new element
            arr[count] = input;
            count++;
        }
        
        // Print the final array elements
        System.out.println("\nFinal array elements entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal elements: " + count + " | Current Array Capacity: " + capacity);
        
        scanner.close();
    }
}

//========================================================================================================================
// Arraylist
import java.util.*;

public class Static{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner (System.in);
        while(true){
            int num=sc.nextInt();
            if(num==-1)
                break;
            al.add(num);
            System.out.println("Size/Number of element of AL=" +al.size());
        }

        al.add(0,44);

        for (var num :al){
            System.out.println(num);
        }
        al.set(2,1000);
        for (var num :al){
            System.out.println(num);
    }
    al.remove(3);
       for (var num :al){
            System.out.println(num);
    }
}
}

