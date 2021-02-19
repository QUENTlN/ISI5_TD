public class Point extends FormeSimple{
    private double rayon;

    public Point(double x,double y, double rayon){
        super(x,y);
        this.rayon=rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Point{x:" + this.getX() + ", y:" + this.getY() + ", rayon:" + rayon + "}");
    }
}
