import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrimeNum(int num){

        if(num==1){
            return true;
        }
        else if(num==2){
            return true;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = isPrimeNum(num);
        if(isPrime){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
