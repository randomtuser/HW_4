package dos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

class southPanel  extends  JPanel{
    JButton b1, b2, b3, b4, b5, b6;
    public  southPanel(){
        JPanel p = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        p.setLayout(new GridLayout(2,3,10,10));

        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("4");
        b5.setActionCommand("5");
        b6.setActionCommand("6");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);

        p.setPreferredSize(new Dimension(290, 130));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(p);
    }
    public void setActionListener(ActionListener actionListener) {
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        b6.addActionListener(actionListener);
    }
}

class centralPenal extends  JPanel{

    private rightCentral rightCentral;
    private leftCentral leftCentral;
    centralCentral centralCentral;

    public  centralPenal(){

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,3));

        leftCentral = new leftCentral();
        add(leftCentral);

        centralCentral  = new centralCentral();
        add(centralCentral);        // First cell


        rightCentral = new rightCentral();
        add(rightCentral);
        setBorder(new EmptyBorder(20, 0,0, 0));  // 20 pixels of space at the top
    }
    void setJ(String text){
        centralCentral.setJ(text);
    }
    public void setActionListener(ActionListener actionListener) {
        rightCentral.setActionListener(actionListener);
        leftCentral.setActionListener(actionListener);
        leftCentral.jComboBox.getSelectedItem();
    }




}
class leftCentral extends  JPanel{
    JComboBox jComboBox;
    public  leftCentral(){
        String[] options =  {"option 1","option 2","option 3","option 4"};
         jComboBox = new JComboBox(options);
        JPanel p = new JPanel();
        JLabel list = new JLabel("List");
        p.add(list);
        p.add(jComboBox);
        add(p);

    }
    public void setActionListener(ActionListener actionListener) {
        jComboBox.addActionListener(actionListener);

    }



}

class centralCentral extends  JPanel{
    JLabel j;
    public  centralCentral(){
        j = new JLabel("");
        add(j);

    }

    void setJ(String text){
        j.setText(text);
    }
}

class rightCentral extends  JPanel{
    JRadioButton j1;
    JRadioButton j2;
    public  rightCentral(){

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));


        ButtonGroup buttonGroup = new ButtonGroup();
        j1 = new JRadioButton("option 1");
        j1.setActionCommand("option 1");
        j1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        j2 = new JRadioButton("option 2");
        j2.setActionCommand("option 2");

        j2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        j1.setSelected(true);
        JLabel list = new JLabel("List");
        list.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        buttonGroup.add(j1);
        buttonGroup.add(j2);
        p.add(list);
        p.add(j1);
        p.add(j2);
        add(p);
    }
    public void setActionListener(ActionListener actionListener) {
        j1.addActionListener(actionListener);
        j2.addActionListener(actionListener);

    }



}