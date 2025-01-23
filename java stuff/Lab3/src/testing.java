import javax.annotation.processing.SupportedOptions;

public class testing {
    public static void main(String[]args){
        clock c1 = new clock(12, 00, "a.m.");
        clock c2 = new clock(12, 00, "p.m.");
        System.out.println(clock.getEarlier(c1, c2));
    }
}
