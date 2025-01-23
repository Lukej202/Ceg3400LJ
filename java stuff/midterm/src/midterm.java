import java.util.Scanner;
public class midterm{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter q to quit");
        while(true){
        System.out.println("is your dog a puppy or adult");
        String dog = sc.next().toLowerCase();
        while(dog.charAt(0) != 'q'){    
            
            if(dog.charAt(0) == 'a' || dog.charAt(0) == 'p'){
            System.out.println("how much does your dog weigh(in lbs and just enter a number)");
            int weight = sc.nextInt();
            if(weight > 40){
                System.out.println("do you have a dog");
            }else{
                if(dog.charAt(0) == 'a'){
                    if(weight >= 2 && weight <=19){
                        System.out.println("3 cups a day");
                    }else if(weight >= 20 && weight <= 40){
                        System.out.println("4 cups a day");
                    }
                }else if(dog.charAt(0) == 'p'){
                    if(weight >= 2 && weight <=10){
                        System.out.println("1 cup a day");
                    }else if(weight >= 11 && weight <= 20){
                        System.out.println("2 cups a day");
                    }
                }
            }
        }else{
            System.out.println("do you have a dog");
        }
        break;
    }
}
}
}