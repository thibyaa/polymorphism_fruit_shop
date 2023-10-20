import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MelonTest {

    Melon watermelon;

    @BeforeEach
    void setUp(){
        watermelon = new Melon("watermelon", 6.00, LocalDate.of(2023, 10, 20), 5, true);
    }

    @Test
    void canIsPreCut(){
        assertThat(watermelon.isPreCut()).isEqualTo(true);
    }

    @Test
    void canSetPreCut(){
        watermelon.setPreCut(false);
        assertThat(watermelon.isPreCut()).isEqualTo(false);
    }
}
