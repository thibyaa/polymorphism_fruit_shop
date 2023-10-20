public class Customer {

    private String name;
    private double wallet;
    private boolean isMember;
    private Basket basket;

    public Customer(String name, double wallet, boolean isMember){
        this.name = name;
        this.wallet = wallet;
        this.isMember = isMember;
        this.basket = new Basket();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
