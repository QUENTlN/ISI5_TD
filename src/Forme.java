import java.awt.*;

public abstract class Forme extends Component {
    private int xStart;
    private int yStart;

    public Forme(int x, int y) {
        this.xStart =x;
        this.yStart =y;
    }

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public abstract void dessiner(Graphics g);

    public abstract void copier(int x, int y);
}
