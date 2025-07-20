package Conditionals;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price: " );
        double CP = sc.nextDouble();
        System.out.println("Enter Selling Price: " );
        double SP = sc.nextDouble();
        if(SP > CP){
            System.out.println("Profit");
        } else if (SP < CP) {
            System.out.println("Loss");
        }else{
            System.out.println("No profit no loss");
        }
    }
}
