package Loops;

public class PrintaAtozZ {
    public static void main(String[] args) {
        // Print from a to z and A to Z
        for(int i=65; i<=90; i++){
            System.out.println((char)(i+32) + " " + (char)i);
        }
    }
}
