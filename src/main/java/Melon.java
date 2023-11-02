import java.time.LocalDate;

public class Melon extends Fruit {

    private boolean preCut;

    public Melon(String name, double price, LocalDate dateOfDisplay, int shelfLife, boolean preCut){
        super(name, price, dateOfDisplay, shelfLife);
        this.preCut = preCut;
    }

    public boolean isPreCut() {
        return preCut;
    }

    public void setPreCut(boolean preCut) {
        this.preCut = preCut;
    }
}
