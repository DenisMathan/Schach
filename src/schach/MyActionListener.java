package schach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {
    private int xpos; //position des gewählten Buttons
    private int ypos;
    private static boolean active = false; //wurde bereits eine figur ausgewählt oder nicht?
    private static Figur gewaehlteFigur; //die Figur die gespeichert bleibt
    private Figur figur = null; //die aktuelle Figur!


    public MyActionListener(int posx, int posy, Figur figur) {
        this.xpos = posx;
        this.ypos = posy;
        this.figur = figur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (active) {
            if (this.figur == null) {
                gewaehlteFigur.move(this.xpos, this.ypos);
                active = false;
                gewaehlteFigur = null;
            } else {
                this.figur.possibilities();
                gewaehlteFigur = this.figur;
            }
        } else {
            if (this.figur.getName().equals("bauer")) {
                System.out.println(this.figur.getName());
                System.out.println(xpos + " " + ypos);
                this.figur.possibilities();
                gewaehlteFigur = this.figur;
                active = true;
            }
            else {
                System.out.println("wtf");
            }
        }

    }


    public void setFigur(Figur figur) {
        this.figur = figur;
    }
}
