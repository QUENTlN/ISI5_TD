public class Rectangle extends FormeSimple{
    private double longueur;
    private double largeur;

    public Rectangle(double x, double y,double longueur, double largeur){
        super(x,y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public void dessiner() {
        System.out.println("Rectangle{x:" + this.getX() + ", y:" + this.getY() + ", longueur:" + longueur + ",largeur:" + largeur + "}");
    }
}
