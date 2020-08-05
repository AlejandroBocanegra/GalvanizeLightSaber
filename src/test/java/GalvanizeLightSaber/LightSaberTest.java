package GalvanizeLightSaber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LightSaberTest {

    @Test
    public void testGetCharge() {
        // setup
        LightSaber lightsaber= new LightSaber();
        //execution
        lightsaber.setCharge(100);
        //assertions
        assertEquals(100, lightsaber.getCharge());
    }

    @Test
    public void testGetColor() {
        // setup
        LightSaber lightsaber= new LightSaber();
        //execution
        lightsaber.setColor("blue");
        //assertions
        assertEquals("blue", lightsaber.getColor());
    }

    @Test
    public void testGetJediSerialNumber() {
        // setup
        LightSaber lightsaber= new LightSaber();
        //execution
        lightsaber.setJediSerialNumber(2);
        //assertions
        assertEquals(2, lightsaber.getJediSerialNumber());
    }

    @Test
    public void testUse() {
        // setup
        LightSaber lightsaber= new LightSaber();
        //execution
        //assertions
        assertEquals(5, lightsaber.use(5.0f));
    }

    @Test
    public void testGetMinutesRemaining() {
        // setup
        LightSaber lightsaber= new LightSaber();
        //execution
        lightsaber.use(5.0f);
        lightsaber.setCharge(100);
        //assertions
        assertEquals(5.0f, lightsaber.getMinutesRemaining());
    }

    // @Test
    // public void testRecharge() {
    //     // setup
    //     LightSaber lightsaber= new LightSaber();
    //     //execution
    //     lightsaber.use(5.0f);
    //     //assertions

    // }
}