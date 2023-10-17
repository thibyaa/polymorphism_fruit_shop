import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FruitTest {

    Fruit strawberries;

    @BeforeEach
    void setUp(){
        strawberries = new Berry("Strawberry", 5.99, 20, LocalDate.of(2023,10,11), 6);
    }

    @Test
    void canCheckIfFruitIsExpired(){
        strawberries.checkIfFruitIsExpired();
        assertThat(strawberries.getExpired()).isEqualTo(true);
    }

    @Test
    void canGetName(){
        assertThat(strawberries.getName()).isEqualTo("Strawberry");
    }

    @Test
    void canSetName(){
        strawberries.setName("Fake");
        assertThat(strawberries.getName()).isEqualTo("Fake");
    }

    @Test
    void canGetPrice(){
        assertThat(strawberries.getPrice()).isEqualTo(5.99);
    }

    @Test
    void canSetPrice(){
        strawberries.setPrice(3.00);
        assertThat(strawberries.getPrice()).isEqualTo(3.00);
    }

    @Test
    void canGetDateOfDisplay(){
        assertThat(strawberries.getDateOfDisplay()).isEqualTo(LocalDate.of(2023,10,11));
    }

    @Test
    void canSetDateOfDisplay(){
        strawberries.setDateOfDisplay(LocalDate.now());
        assertThat(strawberries.getDateOfDisplay()).isEqualTo(LocalDate.now());
    }

    @Test
    void canGetShelfLife(){
        assertThat(strawberries.getShelfLife()).isEqualTo(6);
    }

    @Test
    void canSetShelfLife(){
        strawberries.setShelfLife(2);
        assertThat(strawberries.getShelfLife()).isEqualTo(2);
    }
}
