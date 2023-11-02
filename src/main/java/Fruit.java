import java.time.LocalDate;

public abstract class Fruit {

    protected String name;
    protected double price;
    protected boolean expired;
    protected LocalDate dateOfDisplay;
    protected int shelfLife;

//    CONSTRUCTOR
    public Fruit (String name, double price, LocalDate dateOfDisplay, int shelfLife){
        this.name = name;
        this.price = price;
        this.expired = false;
        this.dateOfDisplay = dateOfDisplay;
        this.shelfLife = shelfLife;
    }

//    CUSTOM METHODS
    public void checkIfFruitIsExpired(){
        if(LocalDate.now().compareTo(dateOfDisplay.plusDays(shelfLife)) > 0){
            setPrice(this.price *= 0.5);
            setExpired(true);
        }
    }

//    GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getExpired() {
        return this.expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public LocalDate getDateOfDisplay() {
        return dateOfDisplay;
    }

    public void setDateOfDisplay(LocalDate dateOfDisplay) {
        this.dateOfDisplay = dateOfDisplay;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
