package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Laeufer implements Figur {
    private int position[];
    private boolean moved = false;
    private int[][] possibilities = new int[28][2];
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Laeufer(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
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
    public void possibilities() {
        for (int i = 0; i <= 27; i++) {
            if(i<=6){
                // links oben
                possibilities[i][0] = this.position[0] - (i+1);
                possibilities[i][1] = this.position[1] - (i+1);
            }
            else if(i>6 && i<=13){
                //rechts unten
                possibilities[i][0] = this.position[0] + (i-6);
                possibilities[i][1] = this.position[1] + (i-6);
            }
            else if(i>13 && i<=20){
                //links unten
                possibilities[i][0] = this.position[0]- (i-13);
                possibilities[i][1] = this.position[1]+ (i-13);}
            else{
                //rechts unten
                possibilities[i][0] = this.position[0] + (i-20);
                possibilities[i][1] = this.position[1] - (i-20);
            }
        }

        for (int i = 0; i <= 27; i++) {
            //Abfage ob sich possibility auf dem Spielfeld befindet
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                if(i<=6){
                    // abfrage ob sich Figur auf possibility befindet
                    //wenn ja soll er gleich alle weiteren possibilities auf dieser Linie überspringen
                    // -> bricht die rote Linie bei treffen auf figur ab
                    if(this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else{
                        i = 6;
                    }
                }
                else if(i>6 && i<=13){
                    if(this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else{
                        i = 13;
                    }
                }
                else if(i>13 && i<=20) {
                    if(this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else{
                        i = 20;
                    }
                }else{
                    if(this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else{
                        i = 30;
                    }
                }

            }
        }
    }

    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=27; i++){
            if(possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7 ){
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null){
                    this.felder[possibilities[i][0]] [possibilities[i][1]].setInActive();}
            }

        }
    }
}