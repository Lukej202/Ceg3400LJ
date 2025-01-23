package stuff;
import java.lang.Math;
public class August34 {
    public static void main(String[]args){
        double x = 6;
        double y = 12;
        double aV = Math.abs(x - y);
        double power = Math.pow(aV , 3);
        double squareRoot = Math.sqrt(power);
        System.out.printf("the answer is %.2f " , squareRoot);

    }
}
