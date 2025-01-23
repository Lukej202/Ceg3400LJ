package stuff.loops;
import java.text.BreakIterator;
import java.util.Scanner;
public class September16th {
    public static void main(String[]args){;
        Object system;
        /*for(int i = 0; i <= 10; ++i ){
        System.out.println(i);
        if(i == 7){
            System.out.println("i equals 7!!!");
            break;
            }
        }*/
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();
        int newNum = 0;
        for(int i = 0; i < howMany; i++){
            newNum = sc.nextInt();
            if (newNum == 42){
            System.out.println("Found " + newNum );
            break;
        }
            
            if(newNum % 2 == 0){
                System.out.println("" + newNum);
                continue;
            }
        }
    }
}
