package schach;

import schach.Figuren.Figur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {
    private int position[];
    private static boolean active = false; //wurde bereits eine figur ausgewählt oder nicht?
    private static Figur gewaehlteFigur; //die Figur die gespeichert bleibt
    private static Feld gewaehltesFeld = null;
    private Feld feld = null; //die aktuelle Figur!


    public MyActionListener(Feld feld, int[] position) {
        this.feld = feld;
        this.position = position;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!active) {
            if(this.feld.getFigur() != null) {
                gewaehlteFigur = this.feld.getFigur();
                    gewaehlteFigur.possibilities();
                    gewaehltesFeld = this.feld;
                    active = true;
            }
            else {
                System.out.println("wtf");
            }
        } else {

            if (this.feld.getFigur() == null && this.feld.getActive()) {
                gewaehlteFigur.hidePossibilities();
                gewaehlteFigur.move(this.position[0], this.position[1]);
                gewaehlteFigur= null;
                gewaehltesFeld.removeFigure();
                gewaehltesFeld = null;

            }
            else if(this.feld.getFigur().getTeam() != gewaehlteFigur.getTeam() && this.feld.getActive()){
                this.feld.getFigur().die();
                gewaehlteFigur.hidePossibilities();
                gewaehlteFigur.move(this.position[0], this.position[1]);
                gewaehlteFigur= null;
                gewaehltesFeld.removeFigure();
                gewaehltesFeld = null;
            }
            else {
                System.out.println("dieser Zug ist nicht möglich!");
                gewaehlteFigur.hidePossibilities();
            }
            active = false;
        }
    }

}
