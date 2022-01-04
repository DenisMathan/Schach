package schach.Mannschaft;

import schach.Feld;
import schach.Figuren.*;

public class Team {
    private Figur[] figur = new Figur[15];
    private int row1, row2;
    private String color;




    public Team(String team, Feld[][] felder, String color){
        if(team.equals("myTeam")){
            this.row1= 7;
            this.row2=6;
            this.color = color;
        }
        else{
            this.row1= 0;
            this.row2=1;
        }
        for (int i=0; i<=7; i++){
            this.figur[i] = new Bauer(i,this.row2, felder, team, color);
        }
        this.figur[8] = new Turm(0, this.row1, felder, team, color);
        this.figur[9] = new Turm(7, this.row1, felder, team, color);
        this.figur[10] = new Pferd(1, this.row1, felder, team, color);
        this.figur[11] = new Pferd(6, this.row1, felder, team, color);
        this.figur[12] = new Laeufer(2, this.row1, felder, team, color);
        this.figur[13] = new Laeufer(5, this.row1, felder, team, color);
        this.figur[14] = new Dame (3,this.row1, felder, team, color);

        for(int i = 0; i<=7; i++){
            felder[i][this.row2].setFigur(this.figur[i]);
        }

        felder[0][this.row1].setFigur(this.figur[8]);
        felder[7][this.row1].setFigur(this.figur[9]);
        felder[1][this.row1].setFigur(this.figur[10]);
        felder[6][this.row1].setFigur(this.figur[11]);
        felder[2][this.row1].setFigur(this.figur[12]);
        felder[5][this.row1].setFigur(this.figur[13]);
        felder[3][this.row1].setFigur(this.figur[14]);
    }
}
