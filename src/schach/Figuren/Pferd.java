package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Pferd implements Figur{
    private int position[];
    private boolean moved = false;
    private int [][] possibilities;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Pferd(int xpos, int ypos, Feld[][] felder){
        this.position = new int[]{ xpos, ypos };
        this.felder = felder;
    }

    @Override
    public void move(int xpos, int ypos) {
        this.position=new int[]{xpos,ypos};
        felder[xpos][ypos].setFigur(this);
        this.moved = true;
    }

    @Override
    public ImageIcon getIcon() {
        return this.icon;
    }

    @Override
    public void possibilities() {
        possibilities = new int[][] {
                {this.position[0]+2, this.position[1]+1}, {this.position[0]+2, this.position[1]-1},
                {this.position[0]-2, this.position[1]+1}, {this.position[0]-2, this.position[1]-1},
                {this.position[0]+1, this.position[1]+2}, {this.position[0]-1, this.position[1]+2},
                {this.position[0]+1, this.position[1]-2}, {this.position[0]-1, this.position[1]-2}};
        for (int i = 0; i<=7; i++){
            if(possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7 ){
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null){
                this.felder[possibilities[i][0]] [possibilities[i][1]].setActive();}
            }
        }
    }

    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=7; i++){
            System.out.println(possibilities[i][0] +" "+ possibilities[i][0]);
            if(possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7 ){
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null){
                    this.felder[possibilities[i][0]] [possibilities[i][1]].setInActive();}
            }

        }
    }
}
