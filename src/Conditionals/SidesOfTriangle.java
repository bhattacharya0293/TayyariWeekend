package Conditionals;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();
        //a+b>c && a+c>b && b+c>a
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            System.out.println("Triangle is possible");
        }else{
            System.out.println("Triangle is not possible");
        }
    }
}
