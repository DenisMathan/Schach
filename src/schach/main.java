package schach;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        double breite, hoehe;
        breite = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        hoehe = Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        GUI myGUI = new GUI(1000,1000);






    }
    protected void paint (Graphics g){
        g.setColor(Color.red); //rot
        g.fillRect(50, 50, 100, 100);
    }
}
