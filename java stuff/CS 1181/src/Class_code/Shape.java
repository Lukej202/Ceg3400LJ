package Class_code;

public abstract class Shape implements Drawable{
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x)throws Exception{
        if(x <= 0){
            throw new Exception("Negative x cordanite not allowed");
        }
        this.x = x; 
    }
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    public String getColor(){
        return color;
    }
    public abstract void draw();
}
