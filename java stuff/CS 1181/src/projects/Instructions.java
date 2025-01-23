package projects;

import javax.swing.*;

public class Instructions extends JFrame{
    /**
     * constructor for the instructions for the game
     */
    public Instructions(){
        super();
        JPanel content = new JPanel();
        this.setContentPane(content);
        this.setTitle("Instructions");
        //creates a text area to hold the text for the game instructions 
        JTextArea text = new JTextArea("To win the Game you need to get score = 10 but you have 2 trys \nonce trys = 0 you loose and the game ends \n numbers will pop on the screen once you hit the start button \nbut once the numbers dissapear enter in the guess box the numbers you saw by pressing the guess button \n to have the next set of numbers appear press start again \nbe carful because every time you guess and bring the next set of numbers they will dissapear quicker so try and memorise all of the numbers \n good luck and hve fun!");

        text.setBounds(50,50,500,500);
        //makes it so the user cant edit the instructions text
        text.setEditable(false);
        content.add(text);
    }
}
