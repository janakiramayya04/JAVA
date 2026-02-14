package infosys;

import java.util.Arrays;
import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Input the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while(start<=end){
            if(arr[start] != arr[end]){
                start++;
                end--;
                count++;
            }else{
                start++;
                count++;
            }
        }

        //System.out.println(Arrays.toString(arr));
        System.out.println(count);

        scanner.close();
    }
}
