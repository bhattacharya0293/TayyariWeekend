package Conditionals;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        int x = (int)num; // typecast
        if(num == x){
            System.out.println("Integer");
        }else {
            System.out.println("Not an Integer");
        }
    }
}
