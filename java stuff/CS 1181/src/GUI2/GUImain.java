package GUI2;

import javax.swing.JFrame;

public class GUImain {
    public static void main(String[]args){
        MyFrame window = new MyFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setVisible(true);

    }
}
