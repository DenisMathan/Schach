package schach;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;
    public GUI (int breite, int hoehe){
        frame = new JFrame("Schach");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(breite,hoehe);
        frame.setLayout(new GridLayout(8,0));


        /*for (int i = 1; i<=8; i++){
            for (int n=1; n<=8; n++){
                Feld feld = new Feld( i, n);
                frame.add(feld.getMyButton());
            }
        }*/
        for (int i = 8; i>=1; i--){
            for (int n=1; n<=8; n++){
                Feld feld = new Feld( n, i);
                frame.add(feld.getMyButton());
            }
        }


        frame.setVisible(true);
        //frame.add(feld);
    }
    public JFrame getframe(){
        return frame;
    }
}
