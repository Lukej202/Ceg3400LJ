package Labs;
// creates custom exception that extends the excetion type IllegalArgumentException
public class negativeLengthException extends IllegalArgumentException{
    /**
     * custom exception constructor with the parent constructor of the class Illigal argument exception
     * @param errorMessage the error message that plays if the exception is caught
     */
    public negativeLengthException(String errorMessage){
        super(errorMessage);
    }
}
