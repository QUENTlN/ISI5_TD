public class Main {
    public static void main(String[] args) {
        // FormeComplexe
        FormeComplexe formeComplexe = new FormeComplexe(10,10);

        // Point
        System.out.println("Point");
        Point point = new Point(10,11,5);
        point.dessiner();
        point.copier(11,10);
        point.dessiner();
        formeComplexe.addFormSimple(point);

        // Ligne
        Ligne ligne = new Ligne(20,30,7);
        ligne.dessiner();
        ligne.copier(10,10);
        ligne.dessiner();
        formeComplexe.addFormSimple(ligne);

        // Cercle
        Cercle cercle = new Cercle(5,3,10);
        cercle.dessiner();
        cercle.copier(13,13);
        cercle.dessiner();
        formeComplexe.addFormSimple(cercle);

        // Rectangle
        Rectangle rectangle = new Rectangle(130,100,30,40);
        rectangle.dessiner();
        rectangle.copier(15,15);
        rectangle.dessiner();
        formeComplexe.addFormSimple(rectangle);

        // FormeComplexe
        formeComplexe.dessiner();
        formeComplexe.copier(100,100);
        formeComplexe.dessiner();
    }
}
