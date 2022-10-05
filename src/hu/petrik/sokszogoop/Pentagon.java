package hu.petrik.sokszogoop;

public class Pentagon extends Sokszog{
    private double b;
    private double c;
    private double d;
    private double e;

    public Pentagon(double a, double b, double c, double d, double e) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public Pentagon(){
        super((Math.random()*10)+1);
        this.b = ((Math.random()*10)+1);
        this.c = ((Math.random()*10)+1);
        this.d = ((Math.random()*10)+1);
        this.e = ((Math.random()*10)+1);
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Override
    public double getKerulet() {
        return this.getA() + this.b + this.c + this.d + this.e;
    }

    @Override
    public double getTerulet() {
        return Math.sqrt(25 + 10 * Math.sqrt(5)) / 4 * Math.pow(super.getA(), 2);
    }

    @Override
    public String toString() {
        return String.format("Ötszög: a = %f, b = %f, c = %f, d = %f, e = %f", this.getA(), this.getB(), this.getC(), this.getD(), this.getE());
    }
}
