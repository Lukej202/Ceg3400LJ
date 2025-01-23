package GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame{
    //for a GUI create a variable up here if you need it to change
    private int clicks = 0;
    private JLabel label;
    private JButton button;
    private JPanel eastPanel;
    public MyFrame(){
        super();

        //label = new JLabel("Click me: ");
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        this.setContentPane(content);
        //content.add(label);

        content.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        //content.add(new JButton("North"), BorderLayout.NORTH);

        //content.add(new JButton("South"), BorderLayout.SOUTH);
        //content.add(new JButton("East"), BorderLayout.EAST);
        

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
        content.add(westPanel, BorderLayout.WEST);
        westPanel.add(new JButton("west 1"));
        westPanel.add(new JButton("west 2"));
        westPanel.add(new JButton("west 3"));
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i < 9; i++){
            centerPanel.add(new JButton("Button"));
        }
        content.add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.PAGE_AXIS));

        content.add(southPanel, BorderLayout.SOUTH);
        JCheckBox checkBox = new JCheckBox("Option 1");
        southPanel.add(checkBox);

        checkBox.addItemListener(e -> {
            System.out.println(e.getStateChange());
        });

        eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.PAGE_AXIS));

        JRadioButton radio1 = new JRadioButton("JOption 1", true);
        JRadioButton radio2 = new JRadioButton("JOption 2", false);
        JRadioButton radio3 = new JRadioButton("JOption 3", false);
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1);
        group1.add(radio2);
        group1.add(radio3);

        ItemListener radioListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                System.out.println(((JRadioButton)e.getSource()).getText());
                System.out.println(e.getStateChange());
            }
        };

        radio1.addItemListener(radioListener);
        radio2.addItemListener(radioListener);
        radio3.addItemListener(radioListener);

        eastPanel.add(radio1);
        eastPanel.add(radio2);
        eastPanel.add(radio3);

        content.add(eastPanel, BorderLayout.EAST);

        String days[] = {"Monday", "Tuesday","Wenesday", "Thuresday", "Friday"};
        JList<String> myDayList = new JList<>(days);

        myDayList.addListSelectionListener( e ->{
            System.out.println(myDayList.getSelectedValue().toString());
        });

        eastPanel.add(myDayList);


        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);

        //Named Inner Class
        // class MenuListener implements ActionListener{
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         String s  = e.getActionCommand();
        //         switch(s){
        //             case "Red":
        //             eastPanel.setBackground(Color.RED);
        //             break;
        //             case "Yello":
        //             eastPanel.setBackground(Color.YELLOW);
        //             break;
        //             case "Blue":
        //             eastPanel.setBackground(Color.BLUE);
        //             break;
        //         }
        //     }
        // }
        
        //MenuListener myMenuListener = new MenuListener();
        //Anonoymous inner class
        ActionListener myMenuListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String s  = e.getActionCommand();
                switch(s){
                    case "Red":
                    eastPanel.setBackground(Color.RED);
                    break;
                    case "Yello":
                    eastPanel.setBackground(Color.YELLOW);
                    break;
                    case "Blue":
                    eastPanel.setBackground(Color.BLUE);
                    break;
                }
            }
        };


        JMenuItem colorItem = new JMenuItem("Red");
        colorMenu.add(colorItem);
        colorItem.addActionListener(myMenuListener);

        colorItem = new JMenuItem("Yello");
        colorMenu.add(colorItem);
        colorItem.addActionListener(myMenuListener);

        colorItem = new JMenuItem("Blue");
        colorMenu.add(colorItem);
        colorItem.addActionListener(myMenuListener);
        
        content.add(menuBar, BorderLayout.NORTH);



        /* named inner class
        class ButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                clicks++;
                button.setText("Clicks: " + clicks);
            }
        }
        */
        //button = new JButton("Clicks: " + clicks);
       //content.add(button);
        //ButtonListener myListener = new ButtonListener();

        

        /*  Anonoymous inner class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                clicks++;
                button.setText("Clicks: " + clicks);
            }
        });
        */
        //Lambda exspression 
        /*button.addActionListener(e -> {
            clicks++;
            button.setText("Clicks " + clicks);
        });*/
    }
}
