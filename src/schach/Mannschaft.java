package schach;

import javax.swing.*;

public class Mannschaft {
    private Bauer[] bauer = new Bauer[8];
    private ImageIcon icon = new ImageIcon("icon.png");
    private Feld[][] felder;

    public Mannschaft(String color, Feld[][] felder){
        this.felder = felder;
        for (int i=0; i<=7; i++){
             bauer[i] = new Bauer(i,6, felder );
        }
    }
    public int[] getBauer1Position(){
        return this.bauer[0].getPosition();
    }
    public Bauer[] getBauer(){
        return bauer;
    }
    public ImageIcon getImageIcon(){
        return this.icon;
    }
}
