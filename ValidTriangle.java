//A triangle is valid if sum of its two sides is greater than the third side

import java.util.Scanner;

public class ValidTriangle {

    static boolean isValid(int x,int y,int z){
        if(x+y>z && y+z>x && x+z>y){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int x = sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int y = sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int z = sc.nextInt();
        boolean isValid = isValid(x,y,z);
        if(isValid){
            System.out.println("The triangle is a Valid Triangle");
        }else{
            System.out.println("The Triangle is not a valid triangle");
        }
    }
}
