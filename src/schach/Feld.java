package schach;

import schach.Figuren.Figur;

import javax.swing.*;
import java.awt.*;

public class Feld {
    private int [] position ;
    private JButton myButton;
    ImageIcon icon = null;
    private Figur figur = null;
    private MyActionListener klick;
    private boolean active = false;

    public Feld(int xpos, int ypos){
        myButton = new JButton(xpos +" " +ypos);
        //berechnet ob das feld schwarz oder weiß ist
        if((xpos%2==0 && ypos%2==0)||(xpos%2==1 && ypos%2==1)){
            myButton.setBackground(new Color (255, 216, 110));
        }
        else {
            myButton.setBackground(new Color(105, 70, 54));
        }

        this.position = new int[] {xpos, ypos};
        myButton.setRolloverEnabled(false);

        this.klick = new MyActionListener(this, this.position);
            myButton.addActionListener(klick);
    }



    public int[] getPosition(){
        return this.position;
    }

    public JButton getMyButton(){
        return myButton;
    }

    public Figur getFigur() {
        return figur;
    }

    public void setFigur(Figur figur){
        this.figur = figur;
        this.icon= figur.getIcon();
        this.myButton.setIcon(this.icon);
    }
    public void removeFigure (){
        this.figur = null;
        myButton.setIcon(null);
    }
    public boolean getActive (){
        return this.active;
    }
    public void setActive(){
            this.active=true;
            myButton.setBackground(Color.red);
    }
    public void setInActive(){
        this.active=false;
        if((this.position[0]%2==0 && this.position[1]%2==0)||(this.position[0]%2==1 && this.position[1]%2==1)){
            myButton.setBackground(new Color (255, 216, 110));
        }
        else{
            myButton.setBackground(new Color(105,70,54));
        }
    }
}
