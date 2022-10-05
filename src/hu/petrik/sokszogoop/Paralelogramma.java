package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog{
    private double b;
    private double alfa;

    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.b = b;
        this.alfa = alfa;
    }

    public Paralelogramma(){
        super((Math.random()*50)+1);
        this.b = ((Math.random()*50)+1);
        alfa = ((Math.random()*180)+1);
    }

    public double getB() {
        return b;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    private double getRadian(){
        return alfa * Math.PI / 180;
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA()+this.b);
    }

    @Override
    public double getTerulet() {
        return Math.abs(Math.sin(getRadian()));
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %f, b = %f, alfa = %f", this.getA(), this.getB(), this.getAlfa());
    }
}
