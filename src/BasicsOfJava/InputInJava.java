package BasicsOfJava;

import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Square of "+x+ " is " +x*x);
    }
}
