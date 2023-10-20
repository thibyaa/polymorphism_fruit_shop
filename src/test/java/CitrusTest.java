import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CitrusTest {

    Citrus citrus;

    @BeforeEach
    void setUp() {
        citrus = new Citrus("Orange", 8.99, LocalDate.of(2023, 10, 18), 5, true);
    }

    @Test
    void checkIsInPack() {
        assertThat(citrus.isInAPack()).isEqualTo(true);
    }

    @Test
    void canSetIsinPack() {
        citrus.setInAPack(false);
        assertThat(citrus.isInAPack()).isEqualTo(false);
    }

}
