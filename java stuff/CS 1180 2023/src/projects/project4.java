package projects;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class project4 {
    /**
     * creates the catacomb based on the user entered size
     * @param n the size of the catacob
     * @return returns the catacomb 2d array
     */
    public static char[][] getDungeonSize(int n){
        char[][] a = new char[n][n];
        return a;
    }
    /**
     * creates the monsters based on the size of the catacomb
     * @param n size of the catacomb
     * @param a ArrayList of actors which holds all of the monsters
     */
    public static void createMonsters(int n, ArrayList<Actor> a){
        for(int i = 0; i < n*n/6; i++){
            Actor monster = new Actor("monster " + (i+1), 25);
            a.add(monster);
        }
    }
    /**
     * creates the users hero
     * @param name the name of the hero
     * @return returns an Actor object the hero
     */
    public static Actor createHero(String name){
        Actor hero = new Actor(name, 100);
        hero.setMaxDamge(10);
        return hero;
    }
    /**
     * places monsters randomly in the catacomb
     * @param c 2d array 
     * @param n size of catacomb
     */
    public static void placeMonsters(ArrayList<Actor> m, int n){
        Random rand = new Random();
            for(int i = 0;i < m.size(); i++){
                int randNum = rand.nextInt(n-1);
                m.get(i).setPosition(i, randNum);
            }
        }
        
    /**
     * moves the hero based on the direction the user enters in i.e. left, right, up, down and checks to make sure the hero can move that direction
     * @param size size of the catacomb
     * @param a Actor object the hero
     */
    public static void move(int size, Actor a){
        Scanner sc = new Scanner(System.in);
        System.out.println("which direction would you like to move?");
        String direction = sc.next();
                        if(direction.equals("right")){
                            if(a.getCollum() == size-1){
                                System.out.println("dead end cant go that way");
                            }else{
                            a.setCollum(a.getCollum()+1);
                            }
                        }else if(direction.equals("left")){
                            if(a.getCollum() == 0){
                                System.out.println("dead end cant go that way");
                            }else{
                            a.setCollum(a.getCollum()-1);
                            }
                        }else if(direction.equals("down")){
                            if(a.getRow() == size-1){
                                System.out.println("dead end cant go that way");
                            }else{
                            a.setRow(a.getRow()+1);
                            }
                        }else if(direction.equals("up")){
                            if(a.getRow() == 0){
                                System.out.println("dead end cant go that way");
                            }else{
                            a.setRow(a.getRow()-1);
                            }
                        }else{
                            System.out.println("not a valid direction try again.");
                        }
        }
    /**
     * counts the monsters that are within 1 room of the hero
     * @param a Actor object the hero
     * @param al ArrayList of actors the monsters
     * @return returns the number of monsters near the hero
     */
    public static int countNearByMonsters(Actor a, ArrayList<Actor> al){
        int count = 0;
        for(int i = 0; i < al.size(); i++){
            if(a.inAdjacentRoom(al.get(i)) == true){
                count++;
            }
        }
        return count;
    }
    /**
     * if the hero is in the same room as a monster the eill fight untl one of them has 0 health remaining if it is the monster that monster is removed from the arraylist for the rest of the game and if it is the hero the game ends
     * @param a Actor object the hero
     * @param al ArrayList of Actors the monsters 
     */
    public static void fight(Actor a, ArrayList<Actor> al){
        for(int i = 0; i < al.size(); i++){
            if(a.inSameRoom(al.get(i)) == true){
                System.out.println("You are in the same room as a monster prepare to fight!");
                while(a.isAlive() == true && al.get(i).isAlive() == true){
                a.hit(al.get(i));
                al.get(i).hit(a);
                if(a.isAlive() == false){
                    System.out.println("you died GAME OVER");
                    System.exit(0);
                }else if(al.get(i).isAlive() == false){
                    System.out.println("good job you killed a monster.");
                    al.remove(i);
                    break;
                }
                }
            }
        }
    }
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        //creates an array list of actors
        ArrayList<Actor> monsters = new ArrayList<>();
        //prompts the user for the size of the catacomb
        System.out.println("What would you like the size of the catacomb to be (between 5 and 10)");
        int size = sc.nextInt();
        //creates the catacob
        char[][] catacomb = getDungeonSize(size);
        //calls createMonster method to create all the monsters
        createMonsters(size, monsters);
        //prompts the user for the heros name
        System.out.println("what would you like the Heros name to be?");
        String heroName = sc.next();
        //creates the users hero
        Actor hero = createHero(heroName);
        //places - throughout the catacomb 2d array - represents empty rooms
        for(int i = 0; i < catacomb.length; i++){
            for(int j = 0; j < catacomb[i].length; j++){
                catacomb[i][j] = '-';
            }
        }
        //calls the placeMonsters method to place the monsters throughout the catacomb
        placeMonsters(monsters, size);
        //places a + at the begining of the catacomb + represents the hero
        catacomb[0][0] = '+';
        //this loop plays the game until the hero has died or escaped
        while(hero.hasEscaped(size) == false){
        //prints how many monsters are nearby the hero
        System.out.println("There are " + countNearByMonsters(hero, monsters) + " monsters nearby.");
        //calls the move method
        move(size, hero);
        //prints the heros position and health
        System.out.println("you are at position " + hero.getPosition() + " heath: " + hero.getHealth());
        //this loop checks eachmonsters position to see if the hero is in the same romm as that monster
        for(int i = 0; i < monsters.size(); i++){
            if(hero.inSameRoom(monsters.get(i))){
                //if the hero is in the same room as a monster and calls the fight method
                fight(hero, monsters);
            }
        }
        //checks if the user has is in the final room of the catacob to check if they escaped
        if(hero.getRow() == size-1 && hero.getCollum() == size-1){
            System.out.println("Congradulations you escaped the catacomb");
            break;
        }
        }
    }
}
