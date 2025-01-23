package Drawing;

import javax.swing.*;
import java.awt.*;

public class GUImain {
    public static void main(String[]args){
        JFrame window = new JFrame();
        JPanel content = new JPanel();
        window.setContentPane(content);
        content.setLayout((LayoutManager) new BoxLayout(content, BoxLayout.PAGE_AXIS));

        Drawing drawingWindow = new Drawing(); 
        content.add(drawingWindow); 

        window.setSize(500, 500);
        window.setLocation(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

       

        
    }
}
