package Sorting;
import java.util.Scanner;
public class reverseArray {
            /* function that reverses array and stores it
           in another array*/
        static void reverse(int a[], int n)
        {
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }

            /*printing the reversed array*/
            System.out.println("Reversed array is: \n");
            for (int k = 0; k < n; k++) {
                System.out.println(b[k]);
            }
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Size of Array:");
            int input = in.nextInt();
            int[] arr = new int[input];
            for (int i=0; i<input; i++) {
                System.out.println("Enter number: " + (i+1));
                arr[i] = in.nextInt();
            }

           reverse(arr, arr.length);
        }

}
