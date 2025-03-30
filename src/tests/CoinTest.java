import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.*;

public class CoinTest {
    
	@Test
    public void testConstructors() {
	//testing Coin constructor using concrete class Penny
	// parameterless constructor
	try {
	    Coin c = new Penny();
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// year arg constructor
	try {
	    Coin c = new Penny(2025);
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}


	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Coin c = new Penny(2025);
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
		if(c.getValue() != 0.01) fail("value getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }
}
    
