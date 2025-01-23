package projects;

import javax.swing.JFrame;

public class project2 {
    public static void main(String[] args) {
        MyFrame window = new MyFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setVisible(true);

        Instructions inst = new Instructions();
        inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inst.setSize(800,300);
        inst.setLocation(400,300);
        inst.setVisible(true);
    }
    
}
