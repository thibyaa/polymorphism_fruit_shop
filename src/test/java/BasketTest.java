import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasketTest {

    Customer gaws;
    Customer sarmi;
    Citrus grapefruit;
    Berry blueberry;
    @BeforeEach
    void setUp(){
        gaws = new Customer("Gawsalya", 50.00, true);
        sarmi = new Customer("Sarmika", 40.00, false);
        grapefruit = new Citrus("Grapefruit", 10.00, LocalDate.of(2023,10,27), 4, true);
        blueberry = new Berry("Blueberry", 6.99,20, LocalDate.of(2023, 11, 23), 6);
        gaws.getBasket().addFruitToBasket(grapefruit);
        sarmi.getBasket().addFruitToBasket(blueberry);
    }

    @Test
    void canApplyDiscount(){
        gaws.getBasket().calculateTotal();
        gaws.getBasket().memberDiscount(gaws);
        assertThat(gaws.getBasket().getTotal()).isEqualTo(9.00);
    }

    @Test
    void canNotApplyDiscount(){
        sarmi.getBasket().calculateTotal();
        sarmi.getBasket().memberDiscount(sarmi);
        assertThat(sarmi.getBasket().getTotal()).isEqualTo(6.00);
    }

    @Test
    void canCalculateTotal(){
        gaws.getBasket().addFruitToBasket(blueberry);
        gaws.getBasket().calculateTotal();
        assertThat(gaws.getBasket().getTotal()).isEqualTo(16.99);
        // weird bug when fruit price is 6.99 - maths goes wrong (delta 001)
    }

    @Test
    void canAddFruitsToBasket(){
        gaws.getBasket().addFruitToBasket(blueberry);
        assertThat(gaws.getBasket().getFruits().size()).isEqualTo(2);
    }

    @Test
    void isDiscountApplied(){
        assertThat(gaws.getBasket().isDiscountApplied()).isEqualTo(false);
    }

    @Test
    void canSetDiscountApplied(){
        gaws.getBasket().setDiscountApplied(true);
        assertThat(gaws.getBasket().isDiscountApplied()).isEqualTo(true);
    }

    @Test
    void canGetTotal(){
        assertThat(gaws.getBasket().getTotal()).isEqualTo(0.00);
    }

    @Test
    void canSetTotal(){
        gaws.getBasket().setTotal(50.00);
        assertThat(gaws.getBasket().getTotal()).isEqualTo(50.00);
    }

    @Test
    void canBuyThreeForThePriceOfTwo(){
        Citrus orange = new Citrus("Orange", 5.00, LocalDate.of(2023, 11, 18), 5, true);
        Citrus mandarin = new Citrus("Orange", 9.00, LocalDate.of(2023, 12, 18), 5, true);
        gaws.getBasket().addFruitToBasket(orange);
        gaws.getBasket().addFruitToBasket(orange);
        gaws.getBasket().addFruitToBasket(orange);

        gaws.getBasket().calculateTotal();
        gaws.getBasket().buyThreeForThePriceOfTwo();
        assertThat(gaws.getBasket().getTotal()).isEqualTo(20.00);
    }
}
