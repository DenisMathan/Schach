package schach;

import javax.swing.*;
import java.awt.*;

public class Feld {
    private String color;
    private int [] ort ;
    private JButton myButton;
    ImageIcon icon = null;

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


            myButton.addActionListener(new MyActionListener());


    }
    public int[] getOrt(){
        return this.ort;
    }
    public JButton getMyButton(){
        return myButton;
    }
    public void setIcon(ImageIcon newIcon, String figur){
        this.icon=newIcon;
        this.myButton.setActionCommand(figur);
        this.myButton.setIcon(newIcon);
    }

}
