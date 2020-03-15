package schach;

import javax.swing.*;

public interface Figur {
    public void move(int xpos, int ypos );
    public ImageIcon getIcon();
    public String getName();
    public void possibilities();
    public Feld[][] getFelder();

}
