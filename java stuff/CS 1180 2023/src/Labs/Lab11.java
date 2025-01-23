package Labs;

public class Lab11 {
    /**
     * this method takes two player objects and then loops until one of the players health is less than or equal to 0
     * @param p1 first player object for the game
     * @param p2 second player object for the game
     */
    public static void game(player p1, player p2){
        while(p1.getHealth() > 0 && p2.getHealth() > 0){
            System.out.println(p1.toString() + " " + p2.toString());
            p1.dealDmage(p2.getMaxDamage());
            p2.dealDmage(p1.getMaxDamage());
            if(p1.getHealth() <= 0){
                p1.setHealth(0);
                System.out.println(p1.toString() + " " + p2.toString());
                System.out.println(p2.toString() + " is the winner!");
            }
            if(p2.getHealth() <= 0){
                p2.setHealth(0);
                System.out.println(p1.toString() + " " + p2.toString());
                System.out.println(p1.toString() +" is the winner!");
            }else{
                continue;
            }
        }
    }
    public static void main(String[]args){
        player p1 = new player("Obi Wan Kenobi", 100, 30);
        player p2 = new player("Darth Vader", 150, 50);
        game(p1, p2);
    }
}
