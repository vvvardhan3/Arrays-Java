package InterviewPrepQuestions;

import java.util.Arrays;


public class missingArray {
    public static void main(String[] args) {
        // Note: 
        // 1.Given array should be in range!
        // 2.Array can be sorted or unsorted!
        int[] a = {11,15,13,12};

        // Unsorted --> Sorted
        Arrays.sort(a);
        // min,max:
        int min = a[0];
        int max = a[a.length-1];

        //System.out.println(min);
        //System.out.println(max);
        

        // Sum of integers in range - Sum of integers in the array = Missing Number!

        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum = sum+a[i];
        }
        // System.out.println("Sum of elements in the given array is: "+ sum); 

        int sum1= 0;
        for(int i = min; i<=max; i++){
            sum1 = sum1+i;
        }
        // System.out.println("Sum of elements in the Range is: "+ sum1); 

        // Missing integer in Array is:

        int missingArray = sum1 - sum;

        System.out.println("Missing integer in array is: "+ missingArray); // Output

    }
}
