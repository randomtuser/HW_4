    package cinco;

    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class controler {
        view v;
        model m;
        public controler(model m, view v) {
            this.m = m;
            this.v = v;


            v.setActionListener(new ControllerActionListener());

        }

        class ControllerActionListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command) {
                    case "blue":
                        v.setCircleColor(Color.BLUE);
                        break;
                    case "red":
                        v.setCircleColor(Color.RED);
                        break;
                    case "yellow":
                        v.setCircleColor(Color.YELLOW);
                        break;
                    case "black":
                        v.setCircleColor(Color.black);
                        break;
                    case "SliderChanged":
                        v.changeRadius(v.sliderValue());

                        break;
                    default:
                        System.out.println("PeliculaController: Comando ’" + command + "’ no reconocido.");
                        System.out.println(v.sliderValue());
                        break;
                }
            }
        }

    }
