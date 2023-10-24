import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FruitShopTest {

    FruitShop kavsFruit;
    Fruit watermelon;
    Fruit orange;
    Customer newCustomer;

    @BeforeEach
    void setUp(){
        kavsFruit = new FruitShop("Kav's Fruit", 100.00);
        watermelon = new Melon("watermelon", 6.00, LocalDate.of(2023, 10, 20), 5, true);
        orange = new Citrus("Orange", 8.99, LocalDate.of(2023, 10, 18), 5, true);
        kavsFruit.addFruitToStock(watermelon);
        newCustomer  = new Customer("Loshanth", 789, true);
        kavsFruit.addCustomerToShop(newCustomer);
        newCustomer.getBasket().addFruitToBasket(orange);

    }

    @Test
    void canGetName(){
        assertThat(kavsFruit.getName()).isEqualTo("Kav's Fruit");
    }

    @Test
    void canSetName(){
        kavsFruit.setName("G's Fruit");
        assertThat(kavsFruit.getName()).isEqualTo("G's Fruit");
    }

    @Test
    void canGetTill(){
        assertThat(kavsFruit.getTill()).isEqualTo(100.00);
    }

    @Test
    void canSetTill(){
        kavsFruit.setTill(0.00);
        assertThat(kavsFruit.getTill()).isEqualTo(0.00);
    }

    @Test
    void canGetFruitStock(){
        assertThat(kavsFruit.getFruitStock().size()).isEqualTo(1);
    }

    @Test
    void canSetFruitStock(){
        ArrayList<Fruit> freshStock = new ArrayList<>();
        kavsFruit.setFruitStock(freshStock);
        assertThat(kavsFruit.getFruitStock().size()).isEqualTo(0);
    }

    @Test
    void canGetCustomers(){
        assertThat(kavsFruit.getCustomers().size()).isEqualTo(1);
    }

    @Test
    void canSetCustomers(){
        ArrayList<Customer> noCustomers = new ArrayList<>();
        kavsFruit.setCustomers(noCustomers);
        assertThat(kavsFruit.getCustomers().size()).isEqualTo(0);
    }

    @Test
    void canAddFruitsToStock(){
        kavsFruit.addFruitToStock(orange);
        assertThat(kavsFruit.getFruitStock().size()).isEqualTo(2);
    }

    @Test
    void canCountStock(){
        assertThat(kavsFruit.countStock()).isEqualTo(1);
    }

    @Test
    void canRemovefruit(){
        kavsFruit.removeFruitFromStock(watermelon);
        assertThat(kavsFruit.getFruitStock().size()).isEqualTo(0);
    }

    @Test
    void canSellFruit_customerHasMoney(){
        kavsFruit.sellFruits(newCustomer);
        assertThat(kavsFruit.getFruitStock().contains(orange)).isEqualTo(false);
        assertThat(kavsFruit.getTill()).isEqualTo(108.99);
    }

}

