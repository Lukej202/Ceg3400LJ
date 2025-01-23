import java.util.Scanner;
public class stringmanipulation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        int length = str.length();
        for(int i = 0; i < length; i++){
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
