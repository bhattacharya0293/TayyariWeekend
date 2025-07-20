package Loops;

public class AtoZWithASCIIValue {
    public static void main(String[] args) {
//        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            System.out.print(ch +" "+ (int) ch + " ");
//            System.out.println(" ");
//        }
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i + " " + i);
        }
    }
}
