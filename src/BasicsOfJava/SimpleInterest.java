package BasicsOfJava;

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 20000;
        double rate = 7.25;
        double time = 5;
        double si = (principal * rate * time)/100;
        System.out.println(si);
    }
}
