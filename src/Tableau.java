import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;

public class Tableau {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.add(new ShapesComponent());
        int frameWidth = 1000;
        int frameHeight = 600;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    static class ShapesComponent extends Component {

        public void paint(Graphics g) {

            Point point = new Point(100,100,10);
            point.dessiner(g);
            point.copier(200,100);
            point.dessiner(g);

            Cercle cercle = new Cercle(200,200,50);
            cercle.dessiner(g);

            Rectangle rectangle = new Rectangle(5,5,100,30);
            rectangle.dessiner(g);
            rectangle.copier(400,100);
            rectangle.dessiner(g);

            Ligne ligne = new Ligne(200,300,200,50);
            ligne.dessiner(g);

            FormeComplexe formesComplexe = new FormeComplexe(500,100);
            formesComplexe.addFormSimple(new Point(500,100,50));
            formesComplexe.addFormSimple(new Cercle(500,150,50));
            formesComplexe.addFormSimple(new Rectangle(500,100,30,20));
            formesComplexe.addFormSimple(new Ligne(500,100,150,150));
            formesComplexe.dessiner(g);
            formesComplexe.copier(500,300);
            formesComplexe.dessiner(g);
        }
    }
}