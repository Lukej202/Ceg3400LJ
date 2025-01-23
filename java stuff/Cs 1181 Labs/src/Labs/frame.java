package Labs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class frame extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private int clicks = 0;
    private JLabel label;
    private ArrayList<JButton> buttons = new  ArrayList<>();
    /** 
     * Constructor for frame class
     * Creates Tic-Tac-Toe game 
     */
    public frame(){
        super();
        setTitle("Tic-Tac Toe");
        //creates the main JPanel for the game
        JPanel content = new JPanel();
        //Gives that JPanel a BorderLayout
        content.setLayout(new BorderLayout());
        this.setContentPane(content);

        //Creates the southPanel where the Game Status label will be hald
        JPanel southPanel = new JPanel();
        //creates that label
        label = new JLabel("Game Status: Player 1's turn");
        southPanel.add(label);
        //adds the southPanel to the to the south border
        content.add(southPanel, BorderLayout.SOUTH);
        
        //makes the mainPanel where the buttons for the game will be heald
        JPanel mainPanel = new JPanel();
        //sets the main panels layout to a GridLayout
        mainPanel.setLayout(new GridLayout(3,3));
        content.add(mainPanel, BorderLayout.CENTER);
        
        //Creates the 9 buttons for the game
        button1 = new JButton(" ");
        button2 = new JButton(" ");
        button3 = new JButton(" ");
        button4 = new JButton(" ");
        button5 = new JButton(" ");
        button6 = new JButton(" ");
        button7 = new JButton(" ");
        button8 = new JButton(" ");
        button9 = new JButton(" ");
        //adds each button to the mainPanel
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);
        //adds each button to an arrayList of JButton objects to make it easier to acess them later
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        //iterates throught the arrayList of JButton objects and adds a ActionListenere to each of them
        for(JButton b: buttons){
            //Lambda exspression to give each button an ActionListener
            b.addActionListener(e ->{
                //checks to see that the buttons text does not equal an X or an O
                    if(b.getText() == " "){
                        //if clicks is 0 or an even number its player ones turn and plces an X on the button clicked
                        if(clicks%2 == 0){
                            b.setText("X");
                            clicks++;
                            label.setText("Game Status: Player 2's turn");
                            //if clicks is an odd number its player twos turn and places an O on the button clicked 
                        }else if(clicks%2 != 0){
                            b.setText("O");
                            clicks++;
                            label.setText("Game Status: Player 1's turn");
                        }
                        //if tje buttons text has an X or an O in it it gives the player a message saying that that button has alereadybeen selected
                        //and to choose another 
                    }else if(b.getText() == "X" || b.getText() == "O"){
                        label.setText("Game Status: that tile has already been selected choose another");
                }
            });
        }
    }
}



