package Conditionals;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num > 999 && num < 10000){
            System.out.println("4 Digit number");
        }else{
            System.out.println("Not a 4 digit number");
        }
    }
}
