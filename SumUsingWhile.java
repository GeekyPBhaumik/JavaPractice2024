//Write a program to find the sum of first n natural numbers using a while loop.

public class SumUsingWhile {
    static int sumOfN(int N){
        int sum=0;
        while(N>=1){
            sum+=N;
            N--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 6;
        System.out.println(sumOfN(N));
    }
}
