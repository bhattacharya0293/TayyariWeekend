package Loops;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            if(i%2 == 0){
                System.out.print(i+ " ");
            }
        }
    }
}
