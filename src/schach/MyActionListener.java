package schach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {
    private int posx;
    private int posy;
    private static boolean active = false;
    private Figur figur;


    public MyActionListener(int posx, int posy, Figur figur){
        this.posx = posx;
        this.posy = posy;
        this.figur= figur;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.figur==null){
            System.out.println("keine Figur");
        }
        else if(this.figur.getName().equals("bauer")){
        System.out.println(this.figur.getName());
        System.out.println(posx +" "+posy);
        this.figur.possibilities();

        this.active = true;
        }
    }


    public void setFigur(Figur figur){
        this.figur = figur;
    }

}
