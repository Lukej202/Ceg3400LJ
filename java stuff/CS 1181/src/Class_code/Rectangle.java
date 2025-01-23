package Class_code;

public class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(int x, int y, String color, int height, int width){
        super(x, y, color);
        //Error checking for height and width
        this.height = height;
        this.width = width;
    }

    //copy constructor
    public Rectangle(Rectangle copyMe){
        super(copyMe.getX(), copyMe.getY(), copyMe.getColor());
        height = copyMe.height;
        width = copyMe.width;

    }

    public void draw(){
        System.out.println("Drawing a " + getColor() + " rectangle at (" + getX() + ", " + getY() + ")" );
        System.out.println(" Height: " + height + " Width: " + width);
    }
}
