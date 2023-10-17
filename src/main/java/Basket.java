import java.util.ArrayList;

public class Basket {

    private boolean discountApplied;
    private ArrayList<Fruit> fruits;
    private double total;

//    CONSTRUCTOR
    public Basket(boolean discountApplied, double total){
        this.discountApplied = discountApplied;
        this.fruits = new ArrayList<>();
        this.total = total;
    }
//    CUSTOM METHODS
    public void memberDiscount(Customer customer){
        if(customer.isMember()){
            this.total *= 0.1;
            setDiscountApplied(true);
        } else this.total *= 1;
    }

// TODO: if there is three of any fruit in the basket, sell it for the price of 2
    public void buyThreeGetOneFree() {
        // loop through the fruits array
        // create a hash map with counters for value?
        // if any of the counters are 3, remove the items from the hashmap
        // deduct the price of one fruit from the overall total
        // discount applied boolean == true
    }

    public void calculateTotal(){
        for(Fruit fruit: fruits){
            this.total += fruit.price;
        }
    }

    public void addFruitToBasket(Fruit fruit){
        this.fruits.add(fruit);
    }

//    GETTERS AND SETTERS
    public boolean isDiscountApplied() {
        return this.discountApplied;
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public ArrayList<Fruit> getFruits() {
        return this.fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
