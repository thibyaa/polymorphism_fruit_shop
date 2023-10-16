import java.time.LocalDate;

public class Berry extends Fruit{

    private int numberOfBerries;

//    CONSTRUCTOR
    public Berry(String name, double price, boolean expired, int numberOfBerries){
        super(name, price, expired);
        this.numberOfBerries = numberOfBerries;
    }

//    GETTERS AND SETTERS
    public int getNumberOfBerries() {
        return this.numberOfBerries;
    }

    public void setNumberOfBerries(int numberOfBerries) {
        this.numberOfBerries = numberOfBerries;
    }
}
