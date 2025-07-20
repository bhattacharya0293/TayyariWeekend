package Conditionals;

import java.util.Scanner;

public class AreaPerimeterCheckOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if(area > perimeter){
            System.out.println("Area is greater than Perimeter");
        }else {
            System.out.println("Area is lesser than Perimeter");
        }
    }
}
