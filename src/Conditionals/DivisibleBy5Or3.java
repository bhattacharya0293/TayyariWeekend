package Conditionals;

import java.util.Scanner;

public class DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("Divisible by 5 or 3");
        }else {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}
