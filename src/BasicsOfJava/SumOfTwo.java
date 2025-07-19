package BasicsOfJava;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(a +" + "+b+ " = " +sum);
    }
}
