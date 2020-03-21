package schach.Figuren;

import schach.Feld;

import javax.swing.*;

public interface Figur {
    public void move(int xpos, int ypos );
    public ImageIcon getIcon();
    public void possibilities();
    public void hidePossibilities();


}
