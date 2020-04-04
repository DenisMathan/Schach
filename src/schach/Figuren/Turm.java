package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Turm implements Figur {

    private int position[];
    private boolean moved = false;
    private int[][] possibilities = new int[28][2];
    private Feld felder[][];
    private String team;



    private ImageIcon icon = new ImageIcon("icon.png");

    public Turm(int xpos, int ypos, Feld[][] felder, String team) {
        this.position = new int[]{xpos, ypos};
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

        for (int i = 0; i <= 27; i++) {
            if(i<=6){
                //wandert die y-Achse hoch
                possibilities[i][0] = this.position[0];
                possibilities[i][1] = this.position[1] - (i+1);
            }
            else if(i>6 && i<=13){
                //wandert die y-Achse herunter
                possibilities[i][0] = this.position[0];
                possibilities[i][1] = this.position[1] + (i-6);
            }
            else if(i>13 && i<=20){
                //wandert die x-achse nach links
                possibilities[i][0] = this.position[0]- (i-13);
                possibilities[i][1] = this.position[1];}
            else{
                //wandert die x-Achse nach rechts
                possibilities[i][0] = this.position[0] + (i-20);
                possibilities[i][1] = this.position[1];
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
                        else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                            this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                            i=6;
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
                if(this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur() == null ||
                        !this.felder[possibilities[i][0]] [possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                    this.felder[possibilities[i][0]] [possibilities[i][1]].setInActive();}
            }

        }
    }
}
