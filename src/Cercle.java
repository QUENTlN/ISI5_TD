public class Cercle extends FormeSimple{
    private double rayon;

    public Cercle(double x, double y, double rayon){
        super(x,y);
        this.rayon=rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Cercle{x:" + this.getX() + ", y:" + this.getY() + ", rayon:" + rayon + "}");
    }
}
