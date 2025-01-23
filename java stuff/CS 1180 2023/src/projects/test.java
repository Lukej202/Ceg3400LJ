package projects;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class test {
    public static boolean checkChars(String s ,String s2){
        char[] c1 = s.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = "halibut";
        String str2 = sc.nextLine();
        if(checkChars(str, str2) == true){
            System.out.println("the string contains characters that are in halibut");
        }else{
            System.out.println("they do not");
        }
        
    }
}
