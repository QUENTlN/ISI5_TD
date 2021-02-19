import java.util.ArrayList;

public class FormeComplexe extends Forme{
    private final ArrayList<FormeSimple> formesSimples;

    public FormeComplexe(double x, double y){
        super(x,y);
        this.formesSimples = new ArrayList<FormeSimple>();
    }

    public void addFormSimple(FormeSimple formeSimple){
        this.formesSimples.add(formeSimple);
    }

    @Override
    public void dessiner() {
        System.out.println("FormeComplexe{");
        for (FormeSimple formeSimple: formesSimples) {
            System.out.print("\t");
            formeSimple.dessiner();
        }
        System.out.println("}");
    }

    @Override
    public void copier(double x, double y) {
        double diffX = x - this.getX();
        double diffY = y - this.getY();
        for (FormeSimple formeSimple: this.formesSimples) {
            formeSimple.setX(formeSimple.getX() + diffX);
            formeSimple.setY(formeSimple.getY() + diffY);
        }
        this.setX(x);
        this.setY(y);
    }
}
