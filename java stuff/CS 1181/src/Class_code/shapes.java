package Class_code;

import java.util.ArrayList;

public class shapes{
    public static void main(String[]args){
        Rectangle rect = new Rectangle(9, 7, "Red", 5, 3);
        try{
        rect.setX(5);
        }catch(Exception e){
            System.out.println("Problem moving rectangle: ");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        rect.draw();

        

        ArrayList<Drawable> things = new ArrayList<>();
        things.add(new Rectangle(4, 5, "Green", 6, 7));
        things.add(new Icon(1, 3, "c:\\somfile.png"));
    }
}
