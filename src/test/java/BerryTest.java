import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BerryTest {

    Berry berry;

    @BeforeEach
    void setUp(){
        berry = new Berry("strawberry", 5.99, 20, LocalDate.of(2023, 10, 17), 5);
    }

    @Test
    void canGetNumberOfBerries(){
        assertThat(berry.getNumberOfBerries()).isEqualTo(20);
    }

    @Test
    void canSetNumberOfBerries(){
        berry.setNumberOfBerries(40);
        assertThat(berry.getNumberOfBerries()).isEqualTo(40);
    }

}
