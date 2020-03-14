package schach;

import javax.swing.*;
import java.awt.*;

public class Feld {

    private String color;
    private int [] FeldKoordinaten ;
    private JButton myButton;

    public Feld(int xpos, int ypos){
        myButton = new JButton(xpos +" " +ypos);
        if((xpos%2==0 && ypos%2==0)||(xpos%2==1 && ypos%2==1)){
            myButton.setBackground(new Color(105,70,54));
        }
        else{
            myButton.setBackground(new Color (255, 216, 110));
        }
        this.FeldKoordinaten = new int[]{xpos, ypos};



    }
    public JButton getMyButton(){
        return myButton;
    }

}
