package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        // b will be 100 if a >= 0
        // b should be 99 if a < 0
        int b = (a >= 0) ? 100 : 99;
        System.out.println(b);
    }
}
