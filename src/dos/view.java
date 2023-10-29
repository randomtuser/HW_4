package dos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view  extends JFrame {
    private centralPenal centralPenal;
    private southPanel southPanel;

    public view() {
         southPanel = new southPanel();
         centralPenal = new centralPenal();

        setLayout(new BorderLayout());
        add(centralPenal, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setTitle("my new window");
        this.setSize(300, 300);
    }
    void setMiddleText(String text){
        centralPenal.setJ(text);
    }

    public  void setActionListener(ActionListener actionListener) {
        southPanel.setActionListener(actionListener);
        centralPenal.setActionListener(actionListener);
    }
}
