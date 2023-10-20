import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer losh;
    @BeforeEach
    void setUp(){
        losh = new Customer("Loshanth", 789, true);
    }

    @Test
    void canGetName(){
        assertThat(losh.getName()).isEqualTo("Loshanth");
    }

    @Test
    void canSetName(){
        losh.setName("Selvanayagam");
        assertThat(losh.getName()).isEqualTo("Selvanayagam");
    }

    @Test
    void canGetWallet(){
        assertThat(losh.getWallet()).isEqualTo(789);
    }

    @Test
    void canSetWallet(){
        losh.setWallet(800);
        assertThat(losh.getWallet()).isEqualTo(800);
    }

    @Test
    void checkIsMember(){
        assertThat(losh.isMember()).isEqualTo(true);
    }

    @Test
    void canSetMember(){
        losh.setMember(false);
        assertThat(losh.isMember()).isEqualTo(false);
    }

    @Disabled
    @Test
    void canGetBurger(){
//        assertThat(losh.getBasket()).isEqualTo();
    }
}
