package schach;

import schach.Figuren.*;

import javax.swing.*;

public class Mannschaft {
    private Figur[] figur = new Figur[15];



    public Mannschaft(String color, Feld[][] felder){

        for (int i=0; i<=7; i++){
             this.figur[i] = new Bauer(i,6, felder );
        }
        this.figur[8] = new Turm(0, 7, felder);
        this.figur[9] = new Turm(7, 7, felder);
        this.figur[10] = new Pferd(1, 7, felder);
        this.figur[11] = new Pferd(6, 7, felder);
        this.figur[12] = new Laeufer(2, 7, felder);
        this.figur[13] = new Laeufer(5, 7, felder);
        this.figur[14] = new Dame (3,7, felder);

        for(int i = 0; i<=7; i++){
            felder[i][6].setFigur(this.figur[i]);
        }

        felder[0][7].setFigur(this.figur[8]);
        felder[7][7].setFigur(this.figur[9]);
        felder[1][7].setFigur(this.figur[10]);
        felder[6][7].setFigur(this.figur[11]);
        felder[2][7].setFigur(this.figur[12]);
        felder[5][7].setFigur(this.figur[13]);
        felder[3][7].setFigur(this.figur[14]);
    }

}
