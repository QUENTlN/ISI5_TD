public abstract class FormeSimple extends Forme{

    public FormeSimple(double x, double y) {
        super(x, y);
    }

    @Override
    public void copier(double x, double y) {
        this.setX(x);
        this.setY(y);
    }
}
