package uno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controler {
    view view;
    model model;
    lowerPanel lower;

    public controler(view view, model model ){
        this.model = model;
        this.view = view;

        view.setActionListener(new ControllerActionListener());

    }
    class ControllerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();

            switch (command) {
                case "submit":
                    String cineContent = view.getCineText();
                    String peliContent = view.getPeliText();
                    model.add(cineContent, peliContent);

                    view.updateDisplay();
                    break;
                case "peliText":
                    System.out.println("Controller: submit ’peliText’.");
                    break;
                case "cineText":
                    System.out.println("Controller: submit ’cineText’.");
                    break;
                default:
                    System.out.println("PeliculaController: Comando ’" + command + "’ no reconocido.");
                    break;
            }
        }
    }

}
