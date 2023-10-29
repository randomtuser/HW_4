package cinco;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class settings extends JPanel  {
    JSlider slider;
    JComboBox<String> comboBox ;
    public settings() {
        Panel whole = new Panel();
        whole.setLayout(new GridLayout(2, 1));

        Panel picker = new Panel();
        picker.setLayout(new FlowLayout());

        JLabel jl = new JLabel("Color");
        String[] list = {"red", "blue","yellow", "black"};
        comboBox  = new JComboBox(list);

        picker.add(jl);
        picker.add(comboBox );

        Panel radio = new Panel();
        JLabel jl2 = new JLabel("Radio");
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);

        radio.add(jl2);
        radio.add(slider);

        whole.add(picker);
        whole.add(radio);

        add(whole);
    }


    public void setActionListener(ActionListener actionListener) {
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Call the actionPerformed method of the provided ActionListener
                actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "SliderChanged"));
            }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) comboBox.getSelectedItem();
                actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, selectedColor));

            }
        });
    }

    public int sliderValue() {
        return slider.getValue();
    }
    public String comboBoxValue() {
        return (String) comboBox.getSelectedItem();
    }
}
