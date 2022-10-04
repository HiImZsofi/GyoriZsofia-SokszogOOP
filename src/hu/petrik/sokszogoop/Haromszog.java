package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    private boolean isSzerkesztheto(){
        boolean szerkesztheto = true;
        if((this.getA() + this.b) <= this.getC() || (this.getA() + this.c) <= this.getB() || (this.c + this.b) <= this.getA()){
            szerkesztheto = false;
        }
        return szerkesztheto;
    }

    public double getKerulet(){
        return this.getA() + this.b + this.c;
    }

    private double getS(){
        return getKerulet() / 2;
    }

    public double getTerulet(){
        return Math.sqrt(this.getS()* (this.getS() - this.getA()) *
                (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f, b = %f, c = %f, K = %f, T = %f", this.getA(), this.getB(), this.getC(), this.getKerulet(), this.getTerulet());
    }
}
