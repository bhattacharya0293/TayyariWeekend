package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & cols: ");
        int m = sc.nextInt();
        for(int i=0; i<m; i++){ // lines or rows
            for(int j=0; j<m; j++){ // stars in each line or cols
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
    }
}
