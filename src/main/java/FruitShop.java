import java.util.ArrayList;

public class FruitShop {

    private String name;
    private double till;
    private ArrayList<Fruit> fruitStock;
//    private ArrayList<Customer> customers;

    public FruitShop(String name, double till){
        this.name = name;
        this.till = till;
        this.fruitStock = new ArrayList<>();
//        this.customers = new ArrayList<>();
    }
//    CUSTOM METHODS
    public void addFruitToStock(Fruit fruit){
        this.fruitStock.add(fruit);
    }

    public int countStock(){
        return this.fruitStock.size();
    }

  public void removeFruitFromStock(Fruit fruit){
        this.fruitStock.remove(fruit);
  }
    public void sellFruits(Customer customer){
        customer.getBasket().applyDiscount(customer);
        customer.getBasket().calculateTotal();
        double basketTotal = customer.getBasket().getTotal();

        if(customer.getWallet() > basketTotal){
            for(Fruit fruit: customer.getBasket().getFruits()){
                removeFruitFromStock(fruit);
            }
            customer.buyFruit();
            setTill(this.till + basketTotal);
        } else System.out.println("You do not have enough money, please come back when you have money");
    }

//    public void addCustomerToShop(Customer customer){
//        this.customers.add(customer);
//    }

//    GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Fruit> getFruitStock() {
        return fruitStock;
    }

    public void setFruitStock(ArrayList<Fruit> fruitStock) {
        this.fruitStock = fruitStock;
    }

//    public ArrayList<Customer> getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(ArrayList<Customer> customers) {
//        this.customers = customers;
//    }
}
