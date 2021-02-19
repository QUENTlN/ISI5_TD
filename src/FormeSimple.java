public abstract class FormeSimple extends Forme{

    public FormeSimple(int x, int y) {
        super(x, y);
    }

    @Override
    public void copier(int x, int y) {
        this.setxStart(x);
        this.setyStart(y);
    }
}
