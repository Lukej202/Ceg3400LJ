//Luke Jennings
import java.util.Scanner;
public class project1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is player ones card starting with rank then suit (2D, JH) then enter both of player twos cards.");
        String pOne = sc.next();
        String pTwo1 = sc.next();
        String pTwo2 = sc.next();
        String two = "2";
        String three = "3";
        String four = "4";
        String five = "5";
        String six = "6";
        String seven = "7";
        String eight = "8";
        String nine = "9";
        String ten = "10";
        String J = "11";
        String Q = "12";
        String K = "13";
        String A = "14";
        int player1Card = 0;
        int player2Card1 = 0;
        int player2Card2 = 0;
        if(pOne.charAt(0) == 'J'){
            player1Card = Integer.parseInt(J);
        }else if(pOne.charAt(0) == 'Q'){
            player1Card = Integer.parseInt(Q);
        }else if(pOne.charAt(0) == 'K'){
            player1Card = Integer.parseInt(K);
        }else if(pOne.charAt(0) == 'A'){
            player1Card = Integer.parseInt(A);
        }else if(pOne.charAt(0) == '1'){
            player1Card = Integer.parseInt(ten);
        }else if(pOne.charAt(0) == '9'){
            player1Card = Integer.parseInt(nine);
        }else if(pOne.charAt(0) == '8'){
            player1Card = Integer.parseInt(eight);
        }else if(pOne.charAt(0) == '7'){
            player1Card = Integer.parseInt(seven);
        }else if(pOne.charAt(0) == '6'){
            player1Card = Integer.parseInt(six);
        }else if(pOne.charAt(0) == '5'){
            player1Card = Integer.parseInt(five);
        }else if(pOne.charAt(0) == '4'){
            player1Card = Integer.parseInt(four);
        }else if(pOne.charAt(0) == '3'){
            player1Card = Integer.parseInt(three);
        }else if(pOne.charAt(0) == '2'){
            player1Card = Integer.parseInt(two);
        }
        if(pOne.charAt(0) == 'J'){
            player2Card1 = Integer.parseInt(J);
        }else if(pTwo1.charAt(0) == 'Q'){
            player2Card1 = Integer.parseInt(Q);
        }else if(pTwo1.charAt(0) == 'K'){
            player2Card1 = Integer.parseInt(K);
        }else if(pTwo1.charAt(0) == 'A'){
            player2Card1 = Integer.parseInt(A);
        }else if(pTwo1.charAt(0) == '1'){
            player2Card1 = Integer.parseInt(ten);
        }else if(pTwo1.charAt(0) == '9'){
            player2Card1 = Integer.parseInt(nine);
        }else if(pTwo1.charAt(0) == '8'){
            player2Card1 = Integer.parseInt(eight);
        }else if(pTwo1.charAt(0) == '7'){
            player2Card1 = Integer.parseInt(seven);
        }else if(pTwo1.charAt(0) == '6'){
            player2Card1 = Integer.parseInt(six);
        }else if(pTwo1.charAt(0) == '5'){
            player2Card1 = Integer.parseInt(five);
        }else if(pTwo1.charAt(0) == '4'){
            player2Card1 = Integer.parseInt(four);
        }else if(pTwo1.charAt(0) == '3'){
            player2Card1 = Integer.parseInt(three);
        }else if(pTwo1.charAt(0) == '2'){
            player2Card1 = Integer.parseInt(two);
        }
        if(pOne.charAt(0) == 'J'){
            player2Card2 = Integer.parseInt(J);
        }else if(pTwo2.charAt(0) == 'Q'){
            player2Card2 = Integer.parseInt(Q);
        }else if(pTwo2.charAt(0) == 'K'){
            player2Card2 = Integer.parseInt(K);
        }else if(pTwo2.charAt(0) == 'A'){
            player2Card2 = Integer.parseInt(A);
        }else if(pTwo2.charAt(0) == '1'){
            player2Card2 = Integer.parseInt(ten);
        }else if(pTwo2.charAt(0) == '9'){
            player2Card2 = Integer.parseInt(nine);
        }else if(pTwo2.charAt(0) == '8'){
            player2Card2 = Integer.parseInt(eight);
        }else if(pTwo2.charAt(0) == '7'){
            player2Card2 = Integer.parseInt(seven);
        }else if(pTwo2.charAt(0) == '6'){
            player2Card2 = Integer.parseInt(six);
        }else if(pTwo2.charAt(0) == '5'){
            player2Card2 = Integer.parseInt(five);
        }else if(pTwo2.charAt(0) == '4'){
            player2Card2 = Integer.parseInt(four);
        }else if(pTwo2.charAt(0) == '3'){
            player2Card2 = Integer.parseInt(three);
        }else if(pTwo2.charAt(0) == '2'){
            player2Card2 = Integer.parseInt(two);
        }
        
        
        System.out.println("out of these two cards pick 1 or 2 " + pTwo1 + " " + pTwo2);
        int player2Card = sc.nextInt();
        if(player1Card > 14 || player2Card1 > 14 || player2Card2 > 14){
            System.out.println("there is an invalid rank");
        }else{
        if (player2Card == 1){
            if(player2Card1 > player1Card){
                System.out.println("player 2 wins!!");
            }else{
                System.out.println("Player 1 wins");
            }
        }else if(player2Card == 2){
            if(player2Card2 > player1Card){
                System.out.println("Player 2 wins!!!");
            }else{
                System.out.println("player 1 wins");
            }
        }else{
            System.out.println("you did not enter 1 or 2");
            }
        }
    }
}
