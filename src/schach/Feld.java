package schach;

import javax.swing.*;
import java.awt.*;

public class Feld {
    private int [] ort ;
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
        else{
            myButton.setBackground(new Color(105,70,54));
        }

        this.ort = new int[] {xpos, ypos};


        myButton.setRolloverEnabled(false);

        this.klick = new MyActionListener(this.ort[0], this.ort[1], this.figur);
            myButton.addActionListener(klick);
            myButton.putClientProperty("id","hassl");



    }
    public int[] getOrt(){
        return this.ort;
    }


    public JButton getMyButton(){
        return myButton;
    }
    public void setFigur(Figur bauer){
        this.klick.setFigur(bauer);
        this.figur = bauer;
        this.icon= bauer.getIcon();

        this.myButton.setIcon(this.icon);
    }
    public void setColor(){
        if (this.active){
            this.active=false;
            if((this.ort[0]%2==0 && this.ort[1]%2==0)||(this.ort[0]%2==1 && this.ort[1]%2==1)){
                myButton.setBackground(new Color (255, 216, 110));
            }
            else{
                myButton.setBackground(new Color(105,70,54));
            }
        }
        else{
            this.active=true;
            myButton.setBackground(Color.red);
        }

    }

}
