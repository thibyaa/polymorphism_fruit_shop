import java.time.LocalDate;

public abstract class Fruit {

    private String name;
    private double price;
    private boolean expired;

//    CONSTRUCTOR
    public Fruit (String name, double price, boolean expired){
        this.name = name;
        this.price = price;
        this.expired = expired;
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
}
