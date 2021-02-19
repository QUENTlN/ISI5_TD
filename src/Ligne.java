import java.awt.*;

public class Ligne extends FormeSimple{
    private int longueur;
    private int largeur;

    public Ligne(int x, int y,int longueur, int largeur){
        super(x,y);
        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public void dessiner(Graphics g) {
        this.print(g);
//        System.out.println("Ligne{x:" + this.getX() + ", y:" + this.getY() + ", longueur:" + longueur + "}");
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.drawLine(this.getxStart(), this.getyStart(), this.getxStart()+largeur, this.getyStart()+longueur);;
    }
}
