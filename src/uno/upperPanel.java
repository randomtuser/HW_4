package uno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class upperPanel extends JPanel {
    right r;
    left l;
    public upperPanel(){
        setLayout(new GridLayout(1,1));

         r = new right();
         l = new left();

        add(l);
        add(r);



    }
    public void setActionListener(ActionListener actionListener) {
        r.setActionListener(actionListener);
        l.setActionListener(actionListener);

    }
    public String getCineText() {
        return l.getCineText();
    }

    public String getPeliText() {
        return l.getPeliText();
    }
}


class left extends JPanel{
    JTextField cineText;
    JTextField peliText;
    public left(){

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel cine = new JLabel("cine");
         cineText = new JTextField(20);

        JLabel peli = new JLabel("peli");
        peliText = new JTextField(20);

        // Add cine label and text field
        gbc.gridx = 0;  // column 0
        gbc.gridy = 0;  // row 0
        gbc.anchor = GridBagConstraints.WEST;  // left alignment
        gbc.insets = new Insets(5, 5, 5, 5);  // padding
        add(cine, gbc);

        gbc.gridx = 1;  // column 1
        add(cineText, gbc);

        // Add peli label and text field
        gbc.gridx = 0;  // column 0
        gbc.gridy = 1;  // row 1
        add(peli, gbc);

        gbc.gridx = 1;  // column 1

        cineText.setActionCommand("cineText");
        peliText.setActionCommand("peliText");



        add(peliText, gbc);
    }
    public void setActionListener(ActionListener actionListener) {
        peliText.addActionListener(actionListener);
        cineText.addActionListener(actionListener);
    }
    public String getCineText() {
        return cineText.getText();
    }

    public String getPeliText() {
        return peliText.getText();
    }


}
class right extends JPanel{
    JButton submit;
    public right(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;  // center horizontally
        gbc.gridy = 0;  // center vertically
        submit = new JButton("submit");
        submit.setActionCommand("submit");
        add(submit, gbc);



    }
    public void setActionListener(ActionListener actionListener) {
        submit.addActionListener(actionListener);

    }


}
