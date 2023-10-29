package uno;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class lowerPanel extends JPanel {
    JTextArea textArea;
    model m;
    HashSet<String> all2;
    public lowerPanel(model m){
        this.m = m;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        textArea = new JTextArea();

        // Make the component stretch to fill its display area in both directions.
        gbc.fill = GridBagConstraints.BOTH;

        // Make the component take up the entire width of the container.
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        // Make the component take up the entire height of the container.
        gbc.gridheight = GridBagConstraints.REMAINDER;

        // Give extra space to the component both horizontally and vertically when resizing.
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5);  // padding
        showText();  // Call this to initially populate the textArea

        add(textArea, gbc);

    }

    public void showText() {
        System.out.println("set");
        all2 = m.all;
        StringBuilder resultado= new StringBuilder();
        for (String p :  m.all) {
            resultado.append(p).append("\n");
        }
        System.out.println(resultado);
        textArea.setText(String.valueOf(resultado));
    }

}
