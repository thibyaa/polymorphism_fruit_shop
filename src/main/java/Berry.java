import java.time.LocalDate;

public class Berry extends Fruit{

    private int numberOfBerries;

//    CONSTRUCTOR
    public Berry(String name, double price, int numberOfBerries, LocalDate dateOfDisplay, int shelfLife){
        super(name, price, dateOfDisplay, shelfLife);
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
