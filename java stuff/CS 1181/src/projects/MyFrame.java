package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class MyFrame extends JFrame{
    private Timer timer;
    private int delay = 3000;
    private int seconds = 1;
    private int score = 0;
    private int trys = 2;
    private JLabel ScoreLabel, tryLabel, label;
    private JButton button;
    private ImageIcon image;
    private ArrayList<Integer> ints = new ArrayList<>();
    /**
     * constructor for MyFrame class
     */
    public MyFrame(){
        super();
        //creates JPanel
        JPanel content = new JPanel();
        //gives the JPanel a borderlayout
        content.setLayout(new BorderLayout());
        this.setContentPane(content);
        //Gives the JFrame a title
        setTitle("Simon Says");

        //Creates the south panel wich holds the buttons to start the game and guess
        //it also holds the score and try labels to display the users score and trys
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.PAGE_AXIS));
        content.add(southPanel, BorderLayout.SOUTH);
        button = new JButton("Start");
        JButton guess = new JButton("Guess");
        ScoreLabel = new JLabel("Score: " + score);
        tryLabel = new JLabel("Trys: " + trys);
        southPanel.add(ScoreLabel);
        southPanel.add(tryLabel);
        southPanel.add(button);
        southPanel.add(guess);

        //creates the north panel witch has the numbers in it 
        JPanel northPanel = new JPanel();
        content.add(northPanel, BorderLayout.NORTH);
        label = new JLabel("Numbers: ");
        northPanel.add(label);

        //I tried to have different difficulty's but it just broke everything so I decided to drop the idea
        // JMenuBar menuBar = new JMenuBar();
        // JMenu menu = new JMenu("Difficulty");
        // menuBar.add(menu);
        // JMenuItem numbers = new JMenuItem("Numbers");
        // JMenuItem colors = new JMenuItem("Colors");
        // menu.add(numbers);
        // menu.add(colors);
        // northPanel.add(menuBar);

        //creates the main panel which has the text box for the user to enter their guess in
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        content.add(mainPanel, BorderLayout.CENTER);
        JLabel label2 = new JLabel("Guess: ");
        JTextField textBox = new JTextField(35);
        mainPanel.add(textBox);
        
        //timer to make the numbers dissapear after a certain amount of time and makes it so the user cant type anything in 
        //until the numbers dissapear
        timer = new Timer(delay, e ->{
            label.setText("Numbers: ");
            textBox.setEditable(true);
            seconds++;
            if(seconds == 1){
                seconds = 0;
                timer.stop();
            }
        });

        //creates a timer to end the game when the user gets a score of 10 or trys = 0
        Timer timer2 = new Timer(3000, e ->{
            System.exit(0);
        });
            //adds a actionListener to button to make the numbers update and if the numbers in the arraylist are more then the players score
            //the numbers will not update so the user cant add more numbers with a low score
            button.addActionListener(f ->{
                if(ints.size() == score){
                ints.add(getRandomNumber());
                label.setText("Numbers: " + ints.toString());
                textBox.setEditable(false);
                timer.start();
                }
            });
            /**
             * adds an action listener to the guess button that checks if the the numbers are equal to the ones the user entered in
             */
            guess.addActionListener(e ->{
                //converts the text in the textbox to an array using the string.split() method
                String[] s = textBox.getText().split(" ");
                ArrayList<Integer> ls = new ArrayList<>();
                //goes through each element in the array and adds it to an arraylist
                for(int i = 0; i < s.length; i++){
                    Integer j = Integer.parseInt(s[i]);
                    ls.add(j);
                }
                //checks the users guess and checks if its equal to the numbers that were on screen 
                if(ints.toString().equals(ls.toString())){
                    score += 1;
                    ScoreLabel.setText("Score: " + score);
                    delay -= 100;
                    textBox.setText("");
                    //if score = 10 the game congradulates the user and exits
                    if(score == 10){
                        try{
                            image = new ImageIcon(getClass().getResource("Image1.png"));
                        }catch(Exception ex){
                            System.out.println("Image could not be found");
                        }
                        ScoreLabel.setText("Score: congrats! you win ");
                        JLabel labl = new JLabel(image);
                        southPanel.add(labl);
                        timer2.start();
                    }
                    //if the users guess did not equal the numbers
                }else if(ints.toString().equals(ls.toString()) == false){
                    trys -= 1;
                    tryLabel.setText("Trys: " + trys);
                    //if the number of guesses that were wrong = 0 then the game exits
                    if(trys == 0){
                        ScoreLabel.setText("Sorry you loose");
                        timer2.start();
                    }
                }
            });

            
    }
    /**
     * gets a random number to add to the arraylist 
     * I had to do it in its own method because it broke everything otherwise
     * @return i a random number between 0 and 9
     */
    public int getRandomNumber(){
        Random rand = new Random();
        int i = rand.nextInt(9);
        return i;
    }

}
