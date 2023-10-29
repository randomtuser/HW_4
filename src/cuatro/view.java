package cuatro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view extends JFrame  {
    colorsPicker cp;
    colorsPicker2 cp2;
    square sq;
    public view(){
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        cp = new colorsPicker();
        add(cp);
        cp2 = new colorsPicker2();
        add(cp2);

        sq = new square();
        add(sq);


        this.setSize(200,300);
        this.setVisible(true);


    }
    public  void setActionListener(ActionListener actionListener) {
       cp.setActionListener(actionListener);
       cp2.setActionListener(actionListener);

    }
    void  setColors1(Color c1){
        sq.setColors1(c1);
        sq.repaint();
    }
    void  setColors2(Color c1){
        sq.setColors2(c1);
        sq.repaint();

    }
}
