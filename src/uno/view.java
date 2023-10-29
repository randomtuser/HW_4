package uno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view extends JFrame {
    upperPanel upper;
    lowerPanel lower;
    model m;
    public view(model m){
        this.setLayout(new GridLayout(2,1));
        this.m= m;


        upper = new upperPanel();
        lower = new lowerPanel(m);
        lower.showText();


        this.add(upper);
        this.add(lower);
        this.setSize(700,400);
        this.setVisible(true);
    }

    public void setActionListener(ActionListener actionListener) {
        upper.setActionListener(actionListener);
    }
    public String getCineText() {
        return upper.getCineText();
    }

    public String getPeliText() {
        return upper.getPeliText();
    }
    public void updateDisplay() {
        lower.showText();
    }


}
