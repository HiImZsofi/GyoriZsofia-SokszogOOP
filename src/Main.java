import hu.petrik.sokszogoop.Haromszog;
import hu.petrik.sokszogoop.Paralelogramma;
import hu.petrik.sokszogoop.Pentagon;
import hu.petrik.sokszogoop.Teglalap;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h.toString());
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() *10 + 5;
            double b = Math.random() *10 + 5;
            System.out.println(new Teglalap(a, b));
        }

        Paralelogramma p = new Paralelogramma();
        System.out.println(p);

        Pentagon p2 = new Pentagon();
        System.out.println(p2);
    }
}