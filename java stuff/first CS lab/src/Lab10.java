public class Lab10 {
    public static void game(){
        player p1 = new player("Iron Man", 100, 10);
        player p2 = new player("Thanos", 200, 20);
        while(true){
        int hit = p1.hit(p2);
        int hit2 = p2.hit(p1);
        System.out.print(p1.toString() + ", " + p2.toString());
        System.out.println();
        hit += hit;
        hit2 += hit2;
        if(hit <= 0){
            break;
        }
        if(hit2 <= 0){
            break;
        }
        }
    }
    public static void main(String[]args){
        game();
    }
}
