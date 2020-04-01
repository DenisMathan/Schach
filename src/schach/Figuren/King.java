package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class King implements Figur{
    private int position [];
    private boolean moved = false;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public King(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;

    }

    public void possibilities(){

        if (!this.moved){
            this.felder[this.position[0]][this.position[0]-1].setActive();
            this.felder[this.position[0]][this.position[0]+1].setActive();
            this.felder[this.position[0]-1][this.position[0]].setActive();
            this.felder[this.position[0]+1][this.position[0]].setActive();
        }


        }
    }
