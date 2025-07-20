package Conditionals;

import java.util.Scanner;

public class AbsoluteValueTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        num = (num < 0) ? -num : num;
        System.out.println(num);
    }
}
