package schach;

import javax.swing.*;

public class GUI {
    public GUI (int breite, int hoehe){
        JFrame frame = new JFrame("Schach");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(breite,hoehe);
        frame.setVisible(true);
    }
}
