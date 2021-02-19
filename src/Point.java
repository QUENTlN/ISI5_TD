import java.awt.*;

public class Point extends FormeSimple{
    private int rayon;

    public Point(int x,int y, int rayon){
        super(x,y);
        this.rayon=rayon;
    }

    @Override
    public void dessiner(Graphics g) {
        this.print(g);
//        System.out.println("Point{x:" + this.getX() + ", y:" + this.getY() + ", rayon:" + rayon + "}");
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.fillOval(this.getxStart(), this.getyStart(), this.rayon*2, this.rayon*2);
    }
}
