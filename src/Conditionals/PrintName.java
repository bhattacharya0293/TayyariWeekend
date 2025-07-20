package Conditionals;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("Aditya");
        }else if(num % 5 == 0){
            System.out.println("Tania");
        } else if (num % 3 == 0) {
            System.out.println("Arjun");
        }else{
            System.out.println("Eva");
        }
    }
}
