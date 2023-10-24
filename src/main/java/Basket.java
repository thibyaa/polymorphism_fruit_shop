import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    private boolean discountApplied;
    private ArrayList<Fruit> fruits;
    private double total;

//    CONSTRUCTOR
    public Basket(){
        this.discountApplied = false;
        this.fruits = new ArrayList<>();
        this.total = 00.00;
    }
//    CUSTOM METHODS
    public void memberDiscount(Customer customer){
        if(customer.isMember()){
            this.total *= 0.9;
            setDiscountApplied(true);
        } else this.total *= 1;
    }

    public void buyThreeGetOneFree() {
        HashMap<Fruit, Integer> fruitfulDiscount = new HashMap<>();
        // loop through the fruits array
        for(Fruit fruit: fruits){
            if(fruitfulDiscount.containsKey(fruit)) {
                fruitfulDiscount.put(fruit, fruitfulDiscount.get(fruit) + 1);
            } else fruitfulDiscount.put(fruit, 1);
        }

        // divide all values by 3, round down to the nearest whole value
        for(Fruit fruit: fruitfulDiscount.keySet()){
            double freeFruit = Math.floor(fruitfulDiscount.get(fruit)/3);
            double totalDiscount = fruit.getPrice() * freeFruit;
            setTotal(this.total -= totalDiscount);

            if(totalDiscount > 0){
                setDiscountApplied(true);
            }
        }

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
