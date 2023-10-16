public class Melon extends Fruit{

    private boolean preCut;

    public Melon(String name, double price, boolean expired, boolean preCut){
        super(name, price, expired);
        this.preCut = preCut;
    }

    public boolean isPreCut() {
        return preCut;
    }

    public void setPreCut(boolean preCut) {
        this.preCut = preCut;
    }
}
