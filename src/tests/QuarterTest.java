import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.*;

public class QuarterTest {
	@Test
    public void testConstructors() {
	//testing Quarter constructor 
	// parameterless constructor
	try {
	    Quarter c = new Quarter();
	}
	catch (Exception e) {
	    fail("Quarter() constructor caused exception: "+e.getMessage());
	}

	// year arg constructor
	try {
	    Quarter c = new Quarter(2025);
	}
	catch (Exception e) {
	    fail("Quarter() constructor caused exception: "+e.getMessage());
	}


	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Quarter c = new Quarter(2025);
		if(c.getValue() != 0.25) fail("value getter failed");
		if(!c.getFamiliarName().equals("Quarter")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("G_Washington")) fail("front image getter failed");
		if(!c.getBackImage().equals("Eagle")) fail("back image getter failed");
		if(!c.getValueDescription().equals("QUARTER DOLLAR")) fail("value description getter failed");
		if(c.getRidgedEdge() != true) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Cupro-Nickel")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using Quarter
		Quarter c = new Quarter(2025);
		String expectedOutput = "[Quarter,0.25,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'G_Washington','Eagle','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','QUARTER DOLLAR',ridges"
	    + ",'Cupro-Nickel']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Quarter
		Quarter c1 = new Quarter(2025, new Copper());
		String expectedOutput1 = (new Copper()).smelt();
		if(!c1.getMetallurgy().equals(expectedOutput1)) fail("Quarter metallurgy constructer failed");

		Quarter c = new Quarter(2025);
		String expectedOutput = (new CuproNickel()).smelt();
		assertEquals(expectedOutput, c.getMetallurgy());
    }
}