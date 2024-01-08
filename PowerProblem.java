//Find if a given number is a perfect power of 2 or not?
// E.g. 1, 2, 4, 8, 16 etc. are perfect powers of 2, whereas 3, 6, 10 are not.

import java.util.Scanner;

public class PowerProblem {

    static boolean isPower(int num){
        int count = 0;
        if(num==1)
            return false;
        while(num>1){
            if(num%2==0){
                count++;
                num/=2;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i=1;;i++){
            System.out.println("Enter a Number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(isPower(n)){
                System.out.println(n +" is a power of "+2);
            }else{
                System.out.println(n +" is not a power of "+2);
            }
        }
    }
}
