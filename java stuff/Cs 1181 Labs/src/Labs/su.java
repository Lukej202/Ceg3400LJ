package Labs;

public class su extends User{
    // creates a private variable the counts the number of failed password attempts
    private int failedAtempts = 0;
    /**
     * calls the parent class constructor which is the User class
     * @param userName the username of the user
     * @param passWord the password of the user
     */
    public su(String userName, String passWord){
        super(userName, passWord);
        }
        /**
         * checkes the password of the user and if they type the wrong password 3 times it locks them out and if they get it right it resets the attempts
         * @param passWord the password of the user
         * @return returns true if the correct password is entered returns false if incorrect password is entered 
         * and will always return false if the user entered the incorrect password three times in a row even if the 
         * correct password is entered after.
         */
    @Override
    public boolean authenticate(String passWord){
        //checks if more thn 3 failed attempts were made
        if(failedAtempts < 3){
            //checks if the users password is valid and is the correct password
        if(super.authenticate(passWord) == true && super.isValidPassword()){
            //resets the failed password attempts
            failedAtempts = 0;
            return super.authenticate(passWord);
        }else{
            //adds 1 to the failed attempts counter
            failedAtempts++;
            return super.authenticate(passWord);
        }
    }
    return false;
    }
}
