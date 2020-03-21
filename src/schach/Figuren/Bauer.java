package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Bauer implements Figur {
    private int position[];
    private boolean moved = false;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Bauer(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
    }

    public void possibilities(){
        //this.felder[position[0]][position[1]-1].setActive();
        // extended for better times
         if (!this.moved){
            this.felder[this.position[0]][this.position[1]-1].setActive();
            this.felder[this.position[0]][this.position[1]-2].setActive();
        }
        else{
            this.felder[position[0]][position[1]-1].setActive();
        }
    }
    public void hidePossibilities(){
        if (!this.moved){
            this.felder[this.position[0]][this.position[1]-1].setInActive();
            this.felder[this.position[0]][this.position[1]-2].setInActive();
        }
        else{
            this.felder[position[0]][position[1]-1].setInActive();
        }
    }


    @Override
    public void move(int xpos, int ypos) {
        this.position=new int[]{xpos,ypos};
        felder[xpos][ypos].setFigur(this);
        this.moved = true;
    }


    public ImageIcon getIcon() {
        return this.icon;
    }

}
