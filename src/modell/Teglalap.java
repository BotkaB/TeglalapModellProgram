package modell;

public class Teglalap {
    private int a, b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public double terulet(){
        return a*b;
    }
    
    public double kerulet(){
        return 2*(a+b);
    }
}
