package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int m = sc.nextInt();
        System.out.println("Enter cols: ");
        int n = sc.nextInt();
        for(int i=0; i<m; i++){ // lines or rows
            for(int j=0; j<n; j++){ // stars in each line or cols
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
    }
}
