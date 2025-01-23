package projects;
import java.util.Scanner;
import java.lang.Math;
public class project1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //creates a variable score to incrementing by 1 after each if statement if the user got the question correct
        int score = 0;
        //creates the variables for all of the questions 
        String q1;
        int q2;
        Boolean q3;
        double q4;
        String q5;
        //asks the user a question that will be a string answer
        System.out.println("what is the name of the main character of the Star wars Original trilogy?");
        q1 = sc.nextLine();
        //converts the users string to all uppercase so the answer will be case insesitive
        q1 = q1.toUpperCase();
        //checks the users answer to see if its correct
        if(q1.equals("LUKE SKYWALKER")){
            System.out.println("you got it right");
            //increments score by 1 
            score = score +1;
        }else{
            System.out.println("sorry incorrect");
        }
        //asks the user a question that will be an int answer
        System.out.println("What year did the first star wars movie come out?");
        q2 = sc.nextInt();
        //checks the users answer to see if its correct
        if(q2 == 1977){
            System.out.println("You got it right");
            //increments score by 1 
            score = score + 1;
        }else{
            System.out.println("Sorry incorrect");
        }
        //asks the user a question that will be an boolean answer
        System.out.println("True or False Chewbaca is a wookie");
        q3 = sc.nextBoolean();
        //checks the users answer to see if its correct
        if(q3 == true){
            System.out.println("You got it right");
            //increments score by 1 
            score = score + 1;
        }else{
            System.out.println("Sorry incorrect");
        }
        //asks the user a question that will be an double answer
        System.out.println("What is the numerical value of e to 2 decimal places?");
        q4 = sc.nextDouble();
        //checks the users answer to see if its correct
        if(q4 == 2.71){
            System.out.println("You got it right");
            //increments score by 1 
            score = score + 1;
        }else{
            System.out.println("Sorry incorrect");
        }
        //asks the user a question that will be an char answer
        System.out.println("what is the last letter of the alphabet?");
        q5 = sc.next();
        q5 = q5.toUpperCase();
        char Q5 = q5.charAt(0);
        //checks the users answer to see if its correct
        if(Q5 == 'Z'){
            System.out.println("You got it right");
            //increments score by 1 
            score = score + 1;
        }else{
            System.out.println("Sorry incorrect");
        }
        //calculates the users score as a percentage as a double
        double percentage = (score/5.0)*100.0;
        //displays the users score as a fraction and a percentage usin the Math.round function to convert percentage to an int
        System.out.println("You got a " + score + "/5 for a percentage of " + Math.round(percentage) + "%");
    }
        


    }
