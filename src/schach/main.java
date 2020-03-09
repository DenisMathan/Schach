package schach;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        GUI myGUI = new GUI(300,300);
        Spielfeld brett = new Spielfeld();
        JPanel mypanel = new JPanel();
        mypanel.setSize(10,10);
        mypanel.setBackground(Color.BLACK);
        //myGui.frame.add(mypanel);
    }
}
