package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.print("button pressed: ");
        System.out.println(((JButton)e.getSource()).getText());
        
    }
}
