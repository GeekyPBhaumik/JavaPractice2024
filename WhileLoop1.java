//Write a code to to print numbers from 5 to 1 using a while loop.

import java.util.Scanner;

public class WhileLoop1 {
    static void printReverse(int N){
       while(N>=1){
           System.out.println(N);
           --N;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printReverse(num);
    }
}
