import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String s = "Silver paperweight, 2, 400";
        String[] a = s.split(", ");
        int i1 = Integer.parseInt(a[1]);
        int i2 = Integer.parseInt(a[2]);

        System.out.println(i1 + i2);
    }
}
