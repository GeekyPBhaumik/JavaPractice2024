import java.util.Scanner;

public class MaxTwoNumbers {

    static int max(int a, int b){
        if(a>b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = max(a,b);
        System.out.println("Maximum No. is "+max);
    }
}
