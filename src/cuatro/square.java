package cuatro;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class square extends JPanel {
    private JPanel drawingPanel;
    Color color1 = (Color.BLUE);
    Color color2 = (Color.BLUE);

    public square(){

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(50, 50,color1, 150, 150,color2);
                g2d.setPaint(gradient);
                g2d.fill(new Rectangle2D.Double(50, 50, 100, 50));
            }
        };
        drawingPanel.setPreferredSize(new Dimension(200, 200));
        add(drawingPanel);

    }
    void  setColors1(Color c){
         color1 = c;
    }
    void  setColors2(Color c){
        color2 = c;
    }

}
