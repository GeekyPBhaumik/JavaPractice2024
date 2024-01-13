//Given an array, check if the given number is present in the array ot not

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements");
        int n = sc.nextInt();
        int targetElement = 5;
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]==targetElement){
                System.out.println("Found target element at "+ i);
                break;
            }
        }

    }


}
