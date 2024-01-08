//Whether a given year is a leap year or not?

import java.util.Scanner;

public class LeapYear {
    //Leap year means if divisible by 4, it should not be divisible by 100
    //or another condition, it should be divisible by 400
    static boolean leapYear(int year){
      if(((year%4)==0 && (year%100)!=0) || (year%400==0)){
          return true;
      }else{
          return false;
      }
    }
    public static void main(String[] args) {
        for(int i=0;;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the year");
            int year = sc.nextInt();
            boolean isLeapYear = leapYear(year);
            if(isLeapYear)
                System.out.println("The year "+year+" is a leap year");
            else
                System.out.println("The year "+year+" is not a leap year");
          }
        }
    }
