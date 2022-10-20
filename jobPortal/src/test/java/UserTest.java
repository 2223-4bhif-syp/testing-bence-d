import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @BeforeAll
    void newJob() {
        User user = new User("Berdan");
        user.newJob(new Job("Berdan", "Fenster putzen"));
        assertEquals(1, user.lengthPurchaserJobs());
    }

    @Test
    @Order(1)
    void work() {
        User user = new User("Berdan");
        user.work(new Job("Berdan", "Fenster putzen"));
        assertEquals(1, user.lengthClientJobs());
    }

    @Test
    @Order(2)
    void finishJob() {
        User user = new User("Berdan");
        user.finishJob(new Job("Berdan", "Fenster putzen"));
        assertEquals(0, user.lengthClientJobs());
    }
}