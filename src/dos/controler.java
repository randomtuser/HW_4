package dos;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controler {
    view view;
    model model;


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
                case "1":
                    model.change(command, view);
                    break;
                case "2":
                    model.change(command, view);
                    break;
                case "3":
                    model.change(command, view);
                    break;
                case "4":
                    model.change(command, view);
                    break;
                case "5":
                    model.change(command, view);
                    break;
                case "6":
                    model.change(command, view);
                    break;
                case "j1":
                    model.change(command, view);
                    break;
                case "j2":
                    model.change(command, view);
                    break;
                case "option 1":
                    model.change(command, view);
                    break;
                case "option 2":
                    model.change(command, view);
                    break;
                case "option 3":
                    model.change(command, view);
                    break;
                default:
                    System.out.println("PeliculaController: Comando ’" + command + "’ no reconocido.");
                    break;
            }}}

    public void setActionListener(ActionListener actionListener) {
        view.setActionListener(actionListener);
    }
    }
