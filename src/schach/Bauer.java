package schach;

import javax.swing.*;

public class Bauer implements Figur {
    private int position[];
    private boolean doubleJump;
    private ImageIcon icon = new ImageIcon("icon.png");

    public Bauer(int xpos, int ypos) {
        this.position = new int[]{xpos, ypos};
    }

    @Override
    public void move() {
        if (this.position[1] == 2 && this.doubleJump) {
            this.position[1] += 2;
        } else {
            this.position[1] += 1;
        }
    }

    public int[] getPosition() {
        return this.position;
    }


    public ImageIcon getIcon() {

        return this.icon;
    }

}
