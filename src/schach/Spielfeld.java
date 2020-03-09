package schach;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import javax.swing.*;


public class Spielfeld {

    public Spielfeld(){

        // 1 panel fürs schachbrett 4 fürs name|zahl
        // JPanel[] panel1,panel2,panel3,panel4,panel5 = new JPanel[5];

        for (int i = 1; i<=8; i++){

            for (int n=1; n<=8; n++){
                Feld feld = new Feld( i, n);
            }}


    }



}
