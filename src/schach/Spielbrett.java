package schach;

import javax.swing.*;
import java.awt.*;

public class Spielbrett {
    private JFrame frame;
    private Mannschaft white;


    public Spielbrett(int breite, int hoehe){
        frame = new JFrame("Schach");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(breite,hoehe);
        frame.setLayout(new GridLayout(8,0));

        Feld[][] felder = new Feld[8][8];
        for (int i = 0; i<=7; i++){

            for (int n=0; n<=7; n++){
                felder[i][n] = new Feld( i, n);
                frame.add(felder[i][n].getMyButton());
            }
        }


        this.white = new Mannschaft("weiß");
        for(int i = 0; i<=7; i++){
            felder[6][i].setIcon(white.getBauer()[1].getIcon(),"bauer");
        }




        frame.setVisible(true);
        //frame.add(feld);
    }
    public JFrame getframe(){
        return frame;
    }
}
