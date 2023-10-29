package cuatro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class colorsPicker2 extends JPanel {
    JRadioButton first;
    JRadioButton second;
    JRadioButton third;

    public colorsPicker2(){

        Panel t1 = new Panel();
        t1.setLayout(new GridLayout(2,1));


        JLabel l = new JLabel("color 2");
        ButtonGroup group = new ButtonGroup();

        Panel t = new Panel();
        t.setLayout(new GridLayout(1,3));
        first = new JRadioButton("blue");
        second = new JRadioButton("red");
        third = new JRadioButton("green");
        first.setSelected(true);

        first.setActionCommand("blue2");
        second.setActionCommand("red2");
        third.setActionCommand("green2");


        group.add(first);
        group.add(second);
        group.add(third);

        add(l);
        t.add(first);
        t.add(second);
        t.add(third);

        t1.add(l);
        t1.add(t);
        add(t1);


    }
    public void setActionListener(ActionListener actionListener) {
        first.addActionListener(actionListener);
        second.addActionListener(actionListener);
        third.addActionListener(actionListener);

    }


}
