    package cinco;

    import javax.swing.*;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.geom.Ellipse2D;

    public class CircleDrawing extends JComponent {
        Color color = Color.RED;;
        int  radius = 50;;
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            // Adjust the radius as needed

            // Create an Ellipse2D object to represent the circle
            Ellipse2D circle = new Ellipse2D.Double(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

            g2d.setColor(color); // Set the circle's color
            g2d.fill(circle); // Fill the circle with the selected color
        }

        public void changeColor(Color newOne){
            color = newOne;
            System.out.println("NEW COLOR:" + color);
            repaint();
        }


        public void changeRadius(int newOne){
            radius = newOne;

        }




    }
