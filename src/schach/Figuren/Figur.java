package schach.Figuren;

import schach.Mannschaft.Team;

import javax.swing.*;

public interface Figur  {
    public void move(int xpos, int ypos );
    public ImageIcon getIcon();
    public String getTeam();
    public void possibilities();
    public void hidePossibilities();
}
