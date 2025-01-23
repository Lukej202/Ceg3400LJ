package Labs;

public class Square {
    private int side;
    /**
     * constructor for square class
     * @param side the side length of the square
     * @throws Exception tells the constructor that exception might be thrown
     */
    public Square(int side)throws Exception{
        if(side <= 0){
            throw new negativeLengthException("Negative side Length");
        }
        this.side = side;
    }
    /**
     * getter for the perimeter of the square
     * @return returns the perimeter
     */
    public double getPerimeter(){
        return 4*this.side;
    }
    /**
     * getter for the area of the square
     * @return returns the area of the squre
     */
    public double getArea(){
        return 2*this.side;
    }

    /**
     * toString method for the square class
     * 
     */
    public String toString(){
        return "side length: " + this.side + " Perimeter: " + getPerimeter() + " Area: " + getArea();
    }


}
