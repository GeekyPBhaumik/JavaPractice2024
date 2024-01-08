//Suppose K=9 and N = 30, find the numbers from 1 to N whose sum of digits is equal to K
import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int temp;
        int sum;
        for(int i=1;i<=N;i++){
            temp = i;
            sum = 0;
            if(temp==k){
                System.out.println(i);
            }else{
                while(temp>0){
                  sum = sum + temp%10;
                  temp=temp/10;
                }
                if(sum==k){
                    System.out.println(i);
                }
            }
        }
    }

}
