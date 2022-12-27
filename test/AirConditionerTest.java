import JavaAssignments.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void acIsOn() {
//        that I have an air conditioner
        AirConditioner airConditioner = new AirConditioner();
//        when I turn on the air conditioner
        airConditioner.setOn(16);
//        that it is on
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void acIsOff(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setOn(0);
        assertFalse(airConditioner.isOn());
    }
}