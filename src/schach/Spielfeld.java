package schach;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import javax.swing.*;


public class Spielfeld {

    public Spielfeld(){
        for (int i = 8; i>=1; i--){
            for (int n=1; n<=8; n++){
                Feld feld = new Feld( n, i);
            }
        }
    }



}
