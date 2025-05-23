import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.*;

public class DollarTest {
	@Test
    public void testConstructors() {
	//testing Dollar constructor
	// parameterless constructor
	try {
	    Dollar c = new Dollar();
	}
	catch (Exception e) {
	    fail("Dollar() constructor caused exception: "+e.getMessage());
	}

	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Dollar c1 = new Dollar();
		Dollar c = c1.manufacture(c1);
		if(c.getValue() != 1.00) fail("value getter failed");
		if(!c.getFamiliarName().equals("Dollar")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("S_Anthony")) fail("front image getter failed");
		if(!c.getBackImage().equals("Moon_Eagle")) fail("back image getter failed");
		if(!c.getValueDescription().equals("ONE DOLLAR")) fail("value description getter failed");
		if(c.getRidgedEdge() != true) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Cupro-Nickel")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using Dollar
		Dollar c1 = new Dollar();
		Dollar c = c1.manufacture(c1);
		String expectedOutput = "[Dollar,1.00,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'S_Anthony','Moon_Eagle','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','ONE DOLLAR',ridges"
	    + ",'Cupro-Nickel']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Dollar
		Dollar c = new Dollar(new Copper());
		Dollar c1 = c.manufacture(c);
		String expectedOutput1 = (new Copper()).smelt();
		if(!c1.getMetallurgy().equals(expectedOutput1)) fail("Dollar metallurgy constructer failed");

		Dollar c2 = new Dollar();
		Dollar c3 = c2.manufacture(c2);
		String expectedOutput = (new CuproNickel()).smelt();
		assertEquals(expectedOutput, c3.getMetallurgy());
    }
}
