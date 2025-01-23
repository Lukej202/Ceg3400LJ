import java.util.Scanner;
import java.util.Random;
public class project2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random randGen = new Random();
        String str1 = "What is the sum of the numbers" ; 
        String str2 = "what was the smallest number";
        String str3 = "what was the biggest number";
        String str4 = "what was the median";
        String[] questions = {str1, str2, str3, str4};
        for(int i = 0; i <= 10; i++){
            String str5 = "That is correct!!";
        int randNum1 = randGen.nextInt(100), randNum2 = randGen.nextInt(100) ,randNum3 = randGen.nextInt(100);
            System.out.print("the 3 numbers for this round are ");
            System.out.println(randNum1 + " " + randNum2 + " " + randNum3);
            //waits 3 seconds to print 100 blank lines
            try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        for(int j = 0; j <= 100; j++){
            System.out.println();
            }
            //randomises the 4 questions
            String question = questions [randGen.nextInt(questions.length)];
            System.out.println(question);
            int answer = sc.nextInt();
            //checks witch question was played
            if(question == str1){
                if(answer == randNum1 + randNum2 + randNum3){
                    System.out.println(str5);
                }else{
                    System.out.println("sorry incorrect");
                }
                }else if(question == str2){
                    if(randNum1 < randNum2 && randNum1 < randNum3){
                        int smallest = randNum1;
                        if(answer == smallest){
                            System.out.println(str5);
                        }
                    }else{
                        System.out.println("Sorry incorect");
                    }
                    if(randNum1 > randNum2 && randNum2 < randNum3){
                        int smallest = randNum2;
                        if(answer == smallest){
                            System.out.println(str5);
                        }
                    }else{
                        System.out.println("Sorry incorect");
                    }
                    if(randNum3 < randNum2 && randNum1 > randNum3){
                        int smallest = randNum3;
                        if(answer == smallest){
                            System.out.println(str5);
                        }
                    }else{
                        System.out.println("Sorry incorect");
                    }
            }else if(question == str3){
                if(randNum1 > randNum2 && randNum1 > randNum3){
                    int biggest = randNum1;
                    if(answer == biggest){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorrect sorry");
                    }
                }
                if(randNum1 < randNum2 && randNum2 > randNum3){
                    int biggest = randNum2;
                    if(answer == biggest){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorrect sorry");
                    }
                }
                if(randNum3 > randNum1 && randNum3 > randNum2){
                    int biggest = randNum3;
                    if(answer == biggest){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorrect sorry");
                    }
                }
            }else if(question == str4){
                if((randNum2 < randNum1 && randNum1 < randNum3) || (randNum3 > randNum1  && randNum1 > randNum2) ){
                    int median = randNum1;
                    if(answer == median){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorect sorry");
                    }
                }
                else if((randNum1 < randNum2 && randNum2 < randNum3) || (randNum3 > randNum2  && randNum2 > randNum1) ){
                    int median = randNum2;
                    if(answer == median){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorect sorry");
                    }
                }
                else if((randNum1 < randNum3 && randNum3 < randNum2) || (randNum1 > randNum3  && randNum3 > randNum2) ){
                    int median = randNum3;
                    if(answer == median){
                        System.out.println(str5);
                    }else{
                        System.out.println("incorect sorry");
                    }
                }   
            }
            }
        }
}

