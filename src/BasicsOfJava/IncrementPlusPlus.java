package BasicsOfJava;

public class IncrementPlusPlus {
    public static void main(String[] args) {
        // ++x, x++, --x, x--
        int x = 10;
        x++; // x = x + 1, x += 1
        System.out.println(x);
        ++x;
        System.out.println(x);

        System.out.println("-----------------");

        int y = 10;
        System.out.println(++y);
        System.out.println(y++);

        System.out.println("-----------------");

        int z = 10;
        System.out.println(z++);
        System.out.println(z);

        int a = 10;
        System.out.println(--a); // a = 9, 9
        System.out.println(a--); // 9, a = 8
        System.out.println(a); // 8
    }
}
