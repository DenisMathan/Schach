package schach.Figuren;

import schach.Feld;
import schach.Figuren.*;

import javax.swing.*;

public class Bauer implements Figur {
    private int position[];
    private int[][] possibilities = new int[4][2];
    private boolean moved = false;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Bauer(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
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
            die(xpos, ypos);
            transform(xpos,ypos);
        }

    }

    @Override
    public ImageIcon getIcon() {
        return this.icon;
    }

    @Override
    public void possibilities() {
        possibilities = new int[][]{
                {this.position[0], this.position[1] - 1},
                {this.position[0], this.position[1] - 2},
                {this.position[0] - 1, this.position[1] + 1},
                {this.position[0] + 1, this.position[1] + 1}
        };

        for (int i = 0; i <= 3; i++) {
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                this.felder[possibilities[0][0]][possibilities[0][1]].setActive();
                if (!this.moved) {
                    this.felder[possibilities[1][0]][possibilities[1][1]].setActive();
                }
            }
        }
    }
    @Override
    public void hidePossibilities() {
        for (int i = 0; i<=3; i++) {
            if (possibilities[i][0] >= 0 && possibilities[i][0] <= 7 && possibilities[i][1] >= 0 && possibilities[i][1] <= 7) {
                if (this.felder[possibilities[i][0]][possibilities[i][1]].getFigur() == null) {
                    this.felder[possibilities[i][0]][possibilities[i][1]].setInActive();
                }
            }
        }
    }
    public void die(int xpos, int ypos){
        System.out.println(xpos+""+ypos);
        this.felder[xpos][ypos].setFigur(null);
    }

    public void transform(int xpos, int ypos){
        System.out.println("juhu ich bin dämlich");
        Figur Dame = new Dame(this.position[0],this.position[1], this.felder);
        this.felder[xpos][ypos].setFigur(Dame);
    }

}
