import hu.petrik.sokszogoop.Haromszog;
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
    }
}