package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Pferd implements Figur{
    private int position[];
    private int [][] possibilities;
    private ImageIcon icon;
    private Feld felder[][];
    private String team;

    public Pferd(int xpos, int ypos, Feld[][] felder, String team, String color){
        this.icon = new ImageIcon("figureIcons/"+color+"/knight.png");
        this.position = new int[]{ xpos, ypos };
        this.felder = felder;
        this.team = team;
    }

    @Override
    public void move(int xpos, int ypos) {
        this.position=new int[]{xpos,ypos};
        felder[xpos][ypos].setFigur(this);
    }

    @Override
    public ImageIcon getIcon() {
        return this.icon;
    }

    @Override
    public String getTeam() {
        return this.team;
    }

    @Override
    public void possibilities() {
        possibilities = new int[][] {
                {this.position[0]+2, this.position[1]+1}, {this.position[0]+2, this.position[1]-1},
                {this.position[0]-2, this.position[1]+1}, {this.position[0]-2, this.position[1]-1},
                {this.position[0]+1, this.position[1]+2}, {this.position[0]-1, this.position[1]+2},
                {this.position[0]+1, this.position[1]-2}, {this.position[0]-1, this.position[1]-2}
        };
        for (int i = 0; i<=7; i++){
            if(possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7 ){
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null || !this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                this.felder[possibilities[i][0]] [possibilities[i][1]].setActive();}
            }
        }
    }

    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=7; i++){
            if(possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7 ){
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null ||
                        !this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                    this.felder[possibilities[i][0]] [possibilities[i][1]].setInActive();}
            }

        }
    }

    @Override
    public void die(){
        this.felder[this.position[0]][this.position[1]].setFigur(null);
    }
}
