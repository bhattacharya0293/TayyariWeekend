package Conditionals;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num 3: ");
        int num3 = sc.nextInt();

//        if(num1 >= num2 && num1 >= num3){
//            System.out.println(num1 +" is greatest Number");
//        }else if(num2 >= num1 && num2 >= num3){
//            System.out.println(num2 +" is greatest Number");
//        }else {
//            System.out.println(num3+ "is graetest");
//        }

        if(num1 >= num2){
            if(num1 >= num3){
                System.out.println(num1+" is greatest Number");
            }else{ // c > a> b
                System.out.println(num3+" is greatest Number");
            }
        }else{ // b > a
            if(num2 >= num3){
                System.out.println(num2+" is greatest Number");
            }else { // c > b > a
                System.out.println(num3+" is greatest Number");
            }
        }
    }
}
