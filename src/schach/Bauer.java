package schach;

import javax.swing.*;

public class Bauer implements Figur {
    private int position[];
    private boolean moved = false;
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld felder[][];

    public Bauer(int xpos, int ypos, Feld[][] felder) {
        this.position = new int[]{xpos, ypos};
        this.felder = felder;
    }

    public void possibilities(){
        int[] expectedPositions;
        if (!this.moved){
            System.out.println(this.position[1]);
            this.felder[this.position[0]][this.position[1]-1].setColor();
            this.felder[this.position[0]][this.position[1]-2].setColor();
        }
        else{
            this.felder[position[0]-1][position[1]].setColor();
        }
    }

    @Override
    public Feld[][] getFelder() {
        return this.felder ;
    }

    @Override
    public void move(int xpos, int ypos) {
        this.position=new int[]{xpos,ypos};
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
