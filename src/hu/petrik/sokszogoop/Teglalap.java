package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public Teglalap(){
        super((Math.random()*50)+1);
        this.b = ((Math.random()*50)+1);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getKerulet(){
        return 2 * (this.getA()+this.b);
    }
    @Override
    public double getTerulet(){
        return this.getA() * this.b;
    }

    public String toString(){
        return String.format("Téglalap: a = %f, b = %f, %s", this.getA(), this.getB(), super.toString());
    }
}
