package cinco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view extends JFrame {
    settings s;
    CircleDrawing c;
    public view(){
        setLayout(new GridLayout(2,1));

        s = new settings();
        add(s);
        c = new CircleDrawing();
        add(c);


        this.setSize(400,500);
        this.setVisible(true);



    }
    public  void setActionListener(ActionListener actionListener) {
       // cp2.setActionListener(actionListener);
        s.setActionListener(actionListener);

    }
    public int sliderValue(){
        return s.sliderValue();
    }

    public String comboBoxValue(){
        return s.comboBoxValue();
    }
    public void setCircleColor(Color color) {
        c.changeColor(color);
        repaint();
    }
    public void changeRadius(int  st) {
        c.changeRadius(st);
        repaint();
    }
}
