import java.time.LocalDate;

public class Citrus extends Fruit {

    private boolean inAPack;

//    CONSTRUCTOR
    public Citrus(String name, double price, boolean expired, boolean inAPack){
        super(name, price, expired);
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
