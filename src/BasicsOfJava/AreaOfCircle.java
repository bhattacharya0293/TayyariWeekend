package BasicsOfJava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double pi = 3.141592;
        double area = pi * r * r;
        System.out.println("Area of circle: "+area);
    }
}
