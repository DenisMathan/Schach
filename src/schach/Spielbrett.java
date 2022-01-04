package schach;

import schach.Mannschaft.Team;

import javax.swing.*;
import java.awt.*;

public class Spielbrett {
    private JFrame frame;
    private Feld[][] felder;


    public Spielbrett(int breite, int hoehe){
        frame = new JFrame("Schach");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(breite,hoehe);
        frame.setLayout(new GridLayout(8,0));

        felder = new Feld[8][8];
        for (int i = 0; i<=7; i++){
            for (int n=0; n<=7; n++){
                felder[n][i] = new Feld( n, i);
                frame.add(felder[n][i].getMyButton());
            }
        }
        Team myTeam = new Team("myTeam", felder, "white");
        Team oponent = new Team("oponent", felder, "black");
        frame.setVisible(true);
        //frame.add(feld);
    }
    public JFrame getframe(){
        return frame;
    }
}
