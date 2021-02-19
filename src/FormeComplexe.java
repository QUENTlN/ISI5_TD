import java.awt.*;
import java.util.ArrayList;

public class FormeComplexe extends Forme{
    private final ArrayList<FormeSimple> formesSimples;

    public FormeComplexe(int x, int y){
        super(x,y);
        this.formesSimples = new ArrayList<FormeSimple>();
    }

    public void addFormSimple(FormeSimple formeSimple){
        this.formesSimples.add(formeSimple);
    }

    @Override
    public void dessiner(Graphics g) {
        for (FormeSimple formeSimple: formesSimples) {
            formeSimple.dessiner(g);
        }
    }

    @Override
    public void copier(int x, int y) {
        int diffX = x - this.getxStart();
        int diffY = y - this.getyStart();
        for (FormeSimple formeSimple: this.formesSimples) {
            formeSimple.setxStart(formeSimple.getxStart() + diffX);
            formeSimple.setyStart(formeSimple.getyStart() + diffY);
        }
        this.setxStart(x);
        this.setyStart(y);
    }
}
