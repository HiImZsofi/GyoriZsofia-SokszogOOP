package hu.petrik.sokszogoop;

public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public abstract double getKerulet();

    public abstract double getTerulet();

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("K = %f, T ( %f", this.getKerulet(), this.getTerulet());
    }
}
