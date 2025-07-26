package PatternPrinting;

import java.util.Scanner;

public class TriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & cols: ");
        int n = sc.nextInt();
        // i + j = n + 1
        for (int i=1; i<= n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
