package schach;

import schach.Figuren.Bauer;
import schach.Figuren.Figur;
import schach.Figuren.Pferd;

import javax.swing.*;

public class Mannschaft {
    private Figur[] figur = new Figur[10];
    private Bauer[] bauer = new Bauer[8];
    private Pferd[] pferd = new Pferd[2];
   /* private Pferd[] pferd = new Pferd[2];
    private Turm[] turm = new Turm[2];
    private Laeufer[] laeufer = new Laeufer[2];
    private Dame    dame = new Dame;
    private King king = new King,*/
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld[][] felder;

    public Mannschaft(String color, Feld[][] felder){
        this.felder = felder;
        for (int i=0; i<=7; i++){
             this.figur[i] = new Bauer(i,6, felder );
        }
        this.figur[8] = new Pferd(1, 7, felder);
        this.figur[9] = new Pferd(6, 7, felder);

        for(int i = 0; i<=7; i++){
            felder[i][6].setFigur(this.figur[i]);
        }
        felder[1][7].setFigur(this.figur[8]);
        felder[6][7].setFigur(this.figur[9]);
    }

}
