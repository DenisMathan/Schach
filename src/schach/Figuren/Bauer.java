package schach.Figuren;

import schach.Feld;
import schach.Figuren.*;

import javax.swing.*;

public class Bauer implements Figur {
    //allgemein
    private int position[];
    private boolean moved = false;
    private Feld felder[][];
    //wichtig für die mannschaft
    private String team;
    private int[][] possibilities = new int[4][2];
    private ImageIcon icon;
    private int target;
    private String color;

    public Bauer(int xpos, int ypos, Feld[][] felder, String team, String color) {
        System.out.println(team);
        this.color = color;
        this.icon = new ImageIcon("figureIcons/"+color+"/pawn.png");
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
        this.team = team;
        if (team.equals("myTeam")) {
            this.target = 0;
        }
        else{
            this.target = 7;
        }
    }

    @Override
    public void move(int xpos, int ypos) {
        this.moved = true;
        this.position = new int[]{xpos, ypos};
        felder[xpos][ypos].setFigur(this);

        if(ypos == 0){
            this.position = new int[]{xpos, ypos};
            felder[xpos][ypos].setFigur(this);
            System.out.println("you got it!");
            die();
            transform(xpos,ypos);
        }

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
        if (this.team == "myTeam"){
        possibilities = new int[][]{
                {this.position[0], this.position[1] - 1},
                {this.position[0], this.position[1] - 2},
                {this.position[0] - 1, this.position[1] - 1},
                {this.position[0] + 1, this.position[1] - 1}
        };
        }
        else{
            possibilities = new int[][]{
                    {this.position[0], this.position[1] + 1},
                    {this.position[0], this.position[1] + 2},
                    {this.position[0] - 1, this.position[1] + 1},
                    {this.position[0] + 1, this.position[1] + 1}
            };
        }

        for (int i = 0; i <= 3; i++) {
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                if (this.felder[possibilities[0][0]][possibilities[0][1]].getFigur()==null) {
                this.felder[possibilities[0][0]][possibilities[0][1]].setActive();
                }
                if (!this.moved && this.felder[possibilities[1][0]][possibilities[1][1]].getFigur()==null) {
                    this.felder[possibilities[1][0]][possibilities[1][1]].setActive();
                }
                if (this.felder[possibilities[2][0]][possibilities[2][1]].getFigur()!= null && !this.felder[possibilities[2][0]][possibilities[2][1]].getFigur().getTeam().equals(this.team)) {
                    this.felder[possibilities[2][0]][possibilities[2][1]].setActive();
                }
                if (this.felder[possibilities[3][0]][possibilities[3][1]].getFigur()!= null && !this.felder[possibilities[3][0]][possibilities[3][1]].getFigur().getTeam().equals(this.team)) {
                    this.felder[possibilities[3][0]][possibilities[3][1]].setActive();
                }
            }
        }
    }
    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=3; i++) {
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null || !this.felder[possibilities[i][0]][possibilities[i][1]].getFigur().getTeam().equals(this.team)) {
                    this.felder[possibilities[i][0]][possibilities[i][1]].setInActive();
                }
            }
        }
    }

    @Override
    public void die(){
        this.felder[this.position[0]][this.position[1]].setFigur(null);
    }

    public void transform(int xpos, int ypos){
        System.out.println("juhu ich bin dämlich");
        Figur dame = new Dame(this.position[0],this.position[1], this.felder, this.team, this.color);
        this.felder[xpos][ypos].setFigur(dame);
    }

}
