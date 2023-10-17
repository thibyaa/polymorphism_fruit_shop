import java.time.LocalDate;

public class Citrus extends Fruit {

    private boolean inAPack;

//    CONSTRUCTOR
    public Citrus(String name, double price, LocalDate dateOfDisplay, int shelfLife, boolean inAPack){
        super(name, price, dateOfDisplay, shelfLife);
        this.inAPack = inAPack;
    }

//    GETTERS AND SETTERS
    public boolean isInAPack() {
        return inAPack;
    }

    public void setInAPack(boolean inAPack) {
        this.inAPack = inAPack;
    }

}
