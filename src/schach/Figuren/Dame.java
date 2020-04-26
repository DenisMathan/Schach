package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Dame implements Figur {
    private int position[];
    private boolean moved = false;
    private int[][] possibilities = new int[56][2];
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];
    private String team;

    public Dame(int xpos, int ypos, Feld[][] felder, String team) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
        this.team = team;

    }

    @Override
    public void move(int xpos, int ypos) {
        this.position = new int[]{xpos, ypos};
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
        for (int i = 0; i <= 55; i++) {
            if (i <= 6) {
                // links oben
                possibilities[i][0] = this.position[0] - (i + 1);
                possibilities[i][1] = this.position[1] - (i + 1);
            } else if (i > 6 && i <= 13) {
                //rechts unten
                possibilities[i][0] = this.position[0] + (i - 6);
                possibilities[i][1] = this.position[1] + (i - 6);
            } else if (i > 13 && i <= 20) {
                //links unten
                possibilities[i][0] = this.position[0] - (i - 13);
                possibilities[i][1] = this.position[1] + (i - 13);
            } else if (i > 20 && i <= 27) {
                //rechts unten
                possibilities[i][0] = this.position[0] + (i - 20);
                possibilities[i][1] = this.position[1] - (i - 20);
            } else if (i > 27 && i <= 34) {
                //wandert die y-Achse hoch
                possibilities[i][0] = this.position[0];
                possibilities[i][1] = this.position[1] - (i -27);
            } else if (i > 34 && i <= 41) {
                //wandert die y-Achse herunter
                possibilities[i][0] = this.position[0];
                possibilities[i][1] = this.position[1] + (i - 34);
            } else if (i > 41 && i <= 48) {
                //wandert die x-achse nach links
                possibilities[i][0] = this.position[0] - (i - 41);
                possibilities[i][1] = this.position[1];
            } else {
                //wandert die x-Achse nach rechts
                possibilities[i][0] = this.position[0] + (i - 48);
                possibilities[i][1] = this.position[1];
            }
        }

        for (int i = 0; i <= 55; i++) {
            //Abfage ob sich possibility auf dem Spielfeld befindet
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                if (i <= 6) {
                    // abfrage ob sich Figur auf possibility befindet
                    //wenn ja soll er gleich alle weiteren possibilities auf dieser Linie überspringen
                    // -> bricht die rote Linie bei treffen auf figur ab
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=6;
                    }
                    else {
                        i = 6;
                    }
                } else if (i > 6 && i <= 13) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=13;
                    }
                    else {
                        i = 13;
                    }
                } else if (i > 13 && i <= 20) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=20;
                    }
                    else {
                        i = 20;
                    }
                } else if (i > 20 && i <= 27) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=27;
                    }
                    else {
                        i = 27;
                    }
                } else if (i > 27 && i <= 34) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=34;
                    }
                    else {
                        i = 34;
                    }
                } else if (i > 34 && i <= 41) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=41;
                    }
                    else {
                        i = 41;
                    }
                }else if(i>41 && i<=48) {
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=48;
                    }
                    else {
                        i = 48;
                    }
                }else{
                    if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                    }
                    else if(!this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)){
                        this.felder[possibilities[i][0]][possibilities[i][1]].setActive();
                        i=56;
                    }
                    else {
                        i = 56;
                    }
                }
            }
        }
    }

    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=55; i++){
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
