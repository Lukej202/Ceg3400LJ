package GUI;

import javax.swing.*;

public class GUImain {
    public static void main(String[]args){
        int clicks = 0;
        JFrame window = new JFrame("Hello World");
        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        yelloPanel myPanel = new yelloPanel();
        window.setContentPane(myPanel);

        JLabel label1 = new JLabel("Clicks: " + clicks);
        myPanel.add(label1);

        JLabel label2 = new JLabel("Goodbye");
        myPanel.add(label2);

        JButton button1 = new JButton("Click me");
        myPanel.add(button1);

        ButtonListener listener1 = new ButtonListener();
        button1.addActionListener(listener1);

        JButton button2 = new JButton("Click me too");
        myPanel.add(button2);

        button2.addActionListener(listener1);

        window.setVisible(true);
        //count(15);
    }

    public static void count(int seconds){
        for(int i = 0; i < seconds; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
