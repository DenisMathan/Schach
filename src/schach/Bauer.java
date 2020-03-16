package schach;

import javax.swing.*;

public class Bauer implements Figur {
    private int position[];
    private int possibilities[][];
    private boolean moved = false;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Bauer(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
    }

    public void possibilities(){
        if (!this.moved){

            System.out.println(this.position[1]);
            this.felder[this.position[0]][this.position[1]-1].setActive();
            this.felder[this.position[0]][this.position[1]-2].setActive();

            this.possibilities=new int[][]{{this.position[0],this.position[1]-1},{this.position[0],this.position[1]-2}};



        }
        else{
            this.felder[position[0]][position[1]-1].setActive();
        }
    }

    @Override
    public Feld[][] getFelder() {
        return this.felder ;
    }

    @Override
    public void move(int xpos, int ypos) {
        felder[position[0]][position[1]].deleteIcon();
        for (int i = 0; i<this.possibilities.length; i++){
            felder[this.possibilities[i][0]][this.possibilities[i][1]].setActive();
            System.out.println(this.possibilities[i][0]+"pos"+this.possibilities[i][1]);
        }
        this.position=new int[]{xpos,ypos};

        felder[xpos][ypos].setFigur(this);
        this.moved = true;

    }

    public int[] getPosition() {
        return this.position;
    }

    public String getName(){
        return "bauer";
    }




    public ImageIcon getIcon() {

        return this.icon;
    }

}
