//Given a number, N. Find the sum of all the digits of N
//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int N) {
        // code here
        int sum=0;
        while(N>0){
            sum+=N%10;
            N=N/10;
        }
        return sum;
    }
    public static void main(String[] args) {
      System.out.println("Enter the Number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = sumOfDigits(num);
      System.out.println(sum);
    }
}
