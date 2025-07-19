package BasicsOfJava;

public class ModulusOperator {
    public static void main(String[] args) {
        //**************************
        //Properties of %
        //**************************
        // a % b = a   (if a < b)
        // 3 % 10 = 3
        //**************************
        // a % (-b) = a % b
        // 7 % (-4) = 7 % 4 = 3
        //**************************
        // (-a) % b = -[a % b]
        // (-7) % 2 = -1
        //**************************
        System.out.println(5%2);
        System.out.println(6%(-4));  // 6%4
        System.out.println((-7)%2);  // -[7%2]
        System.out.println((-39)%(-14)); // (-39)%14 -> -[39%14]
        System.out.println(34%345);
        System.out.println(10%2);
    }
}
