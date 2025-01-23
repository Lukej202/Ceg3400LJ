package Drawing;

import javax.swing.*;
import java.awt.*;
public class Drawing extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 75, 75);
        g.drawRect(this.getWidth()/2,this.getHeight()/2 ,this.getWidth() , this.getHeight());
    }
}
