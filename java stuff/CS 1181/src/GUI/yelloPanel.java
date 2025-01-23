package GUI;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;
public class yelloPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
