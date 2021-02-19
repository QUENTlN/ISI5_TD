import java.awt.*;

public class Rectangle extends FormeSimple{
    private int longueur;
    private int largeur;

    public Rectangle(int x, int y,int longueur, int largeur){
        super(x,y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public void dessiner(Graphics g) {
        this.print(g);
//        System.out.println("Rectangle{x:" + this.getX() + ", y:" + this.getY() + ", longueur:" + longueur + ",largeur:" + largeur + "}");
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.fillRect(this.getxStart(), this.getyStart(), largeur, longueur);
    }
}
