package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public class Turm implements Figur {

    private int position[];
    private boolean moved = false;
    private int [][] possibilities;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    @Override
    public void move(int xpos, int ypos) {

    }

    @Override
    public ImageIcon getIcon() {
        return this.icon;
    }

    @Override
    public void possibilities() {
        for (int z = 0; z<=3; z++)
        for (int i = 0; i<=7; i++){
            possibilities = new int[][] {
                    {this.position[0], this.position[1]+i}
            };
        }
    }

    @Override
    public void hidePossibilities() {

    }
}
