// Java Program to Sort the Elements in Descending Order
import java.util.*;

// Driver Class
class GFG {
      // Main Method
    public static void main(String[] args)
    {
        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}

// Java Program to Sort the Elements
// In Descending Order
import java.util.*;

// Driver Class
class GFG {
      // Main Methods
    public static void main(String[] args)
    {
        // Initializing the array
        int array[] = { 1, 2, 3, 4, 5, 6 };

        // Sorting the array in ascending order
        Arrays.sort(array);

        // Reversing the array
        reverse(array);

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array)
    {
        // Length of the array
        int n = array.length;

        // Swapping the first half elements 
        // With last Half Elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half
              // to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
            array[n - i - 1] = temp;
        }
#code changes by Ethan for Feature2.2 for HDFC Application
// Java Program to demonstrate merging 
// two array using pre-defined method 

import java.util.Arrays; 

public class MergeTwoArrays1 { 
	public static void main(String[] args) 
	{ 
		// first array 
		int[] a = { 10, 20, 30, 40 }; 

		// second array 
		int[] b = { 50, 60, 70, 80 }; 

		// determines length of firstArray 
		int a1 = a.length; 
		
		// determines length of secondArray 
		int b1 = b.length; 
		
		// resultant array size 
		int c1 = a1 + b1; 

		// create the resultant array 
		int[] c = new int[c1]; 

		// using the pre-defined function arraycopy 
		System.arraycopy(a, 0, c, 0, a1); 
		System.arraycopy(b, 0, c, a1, b1); 

		// prints the resultant array 
		System.out.println(Arrays.toString(c)); 
	} 
}
#end of Feature2.2 method 
=======
#code changes for Feature2.1 by Developer Vivek on Feb2024 for service module for HDFC bANK ApplicationException
// Java Program to sort the elements of an array
// in Ascending Order by Inbuilt Methods

// Importing Arrays class from java.util package
import java.util.Arrays;

// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initialize array
		// The array contains 6 elements.
		int[] array = new int[] { -5, -9, 8, 12, 1, 3 };

		// Displaying elements of original array
		System.out.print("Elements of original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Using Arrays.sort() method to sort array
		// elements in ascending order.
		Arrays.sort(array);

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println(
			"Elements of array sorted in ascending order : "
			+ Arrays.toString(array));
	}
}
#End of Feature2.1 Method
    }
}

