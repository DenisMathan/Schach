package schach;

public class Feld {

    private String color;
    private int [] FeldKoordinaten ;

    public Feld(int xpos, int ypos){
        if((xpos%2==0 && ypos%2==0)||(xpos%2==1 && ypos%2==1)){
            this.color = "black";
        }
        else{
            this.color = "white";
        }
        this.FeldKoordinaten = new int[]{xpos, ypos};
        System.out.println("xpos= "+xpos+" ypos= "+ypos +" " +this.color);
        //JPanel visFeld = new JPanel;
    }
}
