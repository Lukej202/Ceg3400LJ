package Labs;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    JTextField textBox;
    JButton convertor;
    /**
     * constructor for myFrame
     * @param name the name of the frame in this case tempature convertor
     */
    public MyFrame(String name){
        super(name);
        //creates the panel
        JPanel content = new JPanel();
        this.setContentPane(content);
        //creates a grid layout for the program
        content.setLayout(new GridLayout(10,100));

        JLabel label1 = new JLabel("Farenheight:");
        textBox = new JTextField(5);
        JLabel label2 = new JLabel("Celcius: ");
        JButton button = new JButton("Convert");
        
        button.addActionListener(e ->{
            int temp = Integer.parseInt(textBox.getText());
            double d = 5.0/9.0;
            try{
                label2.setText("Celcius: " + (temp - 32) * d);
            }catch(Exception ex){
                label2.setText("not a number try again.");
            }
        });

        content.add(label1);
        content.add(textBox);
        content.add(label2);
        content.add(button);


    }
}
