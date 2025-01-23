//Luke Jennings
import java.util.Scanner;
import java.util.ArrayList;
public class project4 {
    
    public static character checkList(String characterName,ArrayList<character> ch){
        for(int i = 0; i < ch.size(); i++){
            String currentPlayerName = ch.get(i).getName();
            if(currentPlayerName.equalsIgnoreCase(characterName)){
                return ch.get(i);
            }
        }
        return null;
    }
    public static void option2(String name, String itemName, int ItemValue, ArrayList<character> ch){
        for(int i = 0; i < ch.size(); i++){
            String currentPlayerName = ch.get(i).getName();
            if(currentPlayerName.equalsIgnoreCase(name)){
                ch.get(i).addItem(itemName, ItemValue);
            }
        }
    }
    public static void option3(String name, String item, ArrayList<character> ch){
        for(int i = 0; i < ch.size(); i++){
            String currentPlayerName = ch.get(i).getName();
            if(currentPlayerName.equalsIgnoreCase(name)){
                ch.get(i).dropItem(item);
            }
        }
    }
    public static void option4(String name, String item, ArrayList<character> ch){
        for(int i = 0; i < ch.size(); i++){
            String currentPlayerName = ch.get(i).getName();
            if(currentPlayerName.equalsIgnoreCase(name)){
                ch.get(i).sellItemToVender(item);
            }
        }
    }
    public static void option5(String name, String buyer, String item, ArrayList<character> ch){
        
    }
    public static void option7(String name, ArrayList<character> ch){
        for(int i = 0; i < ch.size(); i++){
            String currentPlayerName = ch.get(i).getName();
            if(currentPlayerName.equalsIgnoreCase(name)){
                ch.get(i).getItems();
            }
        }
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(true){
    ArrayList<character> characters = new ArrayList<>();
    System.out.println("1. Create a character");
    System.out.println("2. Add an Item");
    System.out.println("3. Drop an Item");
    System.out.println("4. sell an item to a vendor");
    System.out.println("5. sell an item to a character");
    System.out.println("6. list character's");
    System.out.println("7. List a characters invetory by value");
    System.out.println("8. List all characters' invetory by value");
    System.out.println("9. quit");
    System.out.println("What would you like to do? ");
    int option = sc.nextInt();
    if (option == 1){
        System.out.println("What is your characters name? ");
        String characterName = sc.next();
        if(checkList(characterName, characters) == null){
        System.out.println("How many credits does your character have? ");
        int credits = sc.nextInt();
        characters.add(new character(characterName, credits));
        System.out.println(characterName + " has been added");
        }else if(checkList(characterName, characters) != null){
            System.out.println("this character already exists");
        }
    } 
    if(option == 2){
        System.out.println("which character is adding an item? ");
        String ch = sc.next();
        if(checkList(ch, characters) != null){
        System.out.println("What is the name of the item? ");
        String item = sc.next();
        System.out.println("What is the value of that item? ");
        int itemValue = sc.nextInt();
        option2(ch, item, itemValue, characters);
            System.out.println(ch + " added " + itemValue);
        }
    }
    if(option == 3){
        System.out.println("which character is dropping an item");
        String ch = sc.next();
        if(checkList(ch, characters) != null){
            System.out.println("What item is the character dropping ");
            String item = sc.next();
            option3(ch, item, characters);
            System.out.println(ch + " has dropped " + item);
        }
    }
    if(option == 4){
        System.out.println("which character is selling an item");
        String character = sc.next();
        if(checkList(character, characters) != null){
            System.out.println("which item would you like to sell");
            String item = sc.next();
            option4(character, item, characters);
            System.out.println(character + " has sold " + item);
        }
    }
    if(option == 5){
        System.out.println("which character is selling an item");
        String name = sc.next();
        if(checkList(name, characters) != null){
            System.out.println("which character is buying the item");
            String buyer = sc.next();
            if(checkList(buyer, characters) != null){
                System.out.println("which item is " + name + "selling");

            }
        }
    }
    if(option == 6){
        for(int i = 0; i < characters.size(); i++){
            characters.get(i).toString();
        }
    }
    if(option == 7){
        System.out.println("which characters items would you like to see");
        String ch = sc.next();
        if(checkList(ch, characters) != null){
            option7(ch, characters);
        }
    }
    if(option == 8){
        for(int i = 0; i < characters.size(); i++){
            characters.get(i).toString();
            for(int j = 0; j < characters.size(); j++)
                characters.get(j).getItems();
        }
    }
    if(option == 9){
        break;
    }
}
}
}