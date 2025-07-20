package Loops;

import java.util.Scanner;

public class Take2IntegerAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter number: ");
        int num1 = sc.nextInt();

        for (int i=num; i<=num1; i++){
            System.out.print(i+ " ");
        }
    }
}
