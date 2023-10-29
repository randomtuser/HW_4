package cuatro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controler {
    view v;
    model m;

    public controler(view v, model m){
        this.m = m;
        this.v = v;

        v.setActionListener(new ControllerActionListener());


    }
    class ControllerActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "blue1":
                    m.change1(Color.blue);
                    break;
                case "blue2":
                    m.change2(Color.blue);
                    break;
                case "red1":
                    m.change1(Color.red);
                    break;
                case "red2":
                    m.change2(Color.red);
                    break;
                case "green1":
                    m.change1(Color.green);
                    break;
                case "green2":
                    m.change2(Color.green);
                    break;
                default:
                    System.out.println("PeliculaController: Comando ’" + command + "’ no reconocido.");
                    break;
            }
        }
    }

    }
