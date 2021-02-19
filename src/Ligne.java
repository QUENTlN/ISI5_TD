public class Ligne extends FormeSimple{
    private double longueur;

    public Ligne(double x, double y,double longueur){
        super(x,y);
        this.longueur=longueur;
    }

    @Override
    public void dessiner() {
        System.out.println("Ligne{x:" + this.getX() + ", y:" + this.getY() + ", longueur:" + longueur + "}");
    }
}
