import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    Driver pawel = new Driver("pawel",100);

    @Test
    public void getDriverNameTest(){
        assertEquals("pawel",pawel.getDriverName());
    }

    @Test
    public void getDriverNumTest(){
        assertEquals(100,pawel.getDriverNum());
    }

    @Test
    public void CheckStatusTest(){
        pawel.check_status();
        assertFalse(pawel.check_status());
    }

    @Test
    public void timeoutExceed(){

        assertTimeout(Duration.ofMillis(1000), () -> { pawel.waitTillbanned();});

    }



}