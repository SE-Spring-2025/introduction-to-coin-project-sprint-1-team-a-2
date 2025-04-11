import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.*;

public class DimeTest {
	@Test
    public void testConstructors() {
	//testing Dime constructor
	// parameterless constructor
	try {
	    Dime c = new Dime();
	}
	catch (Exception e) {
	    fail("Dime() constructor caused exception: "+e.getMessage());
	}

	// year arg constructor
	try {
	    Dime c = new Dime(2025);
	}
	catch (Exception e) {
	    fail("Dime() constructor caused exception: "+e.getMessage());
	}


	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Dime c = new Dime(2025);
		if(c.getValue() != 0.1) fail("value getter failed");
		if(!c.getFamiliarName().equals("Dime")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("F_Roosevelt")) fail("front image getter failed");
		if(!c.getBackImage().equals("Torch_Branches")) fail("back image getter failed");
		if(!c.getValueDescription().equals("ONE DIME")) fail("value description getter failed");
		if(c.getRidgedEdge() != true) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Cupro-Nickel")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using Dime
		Dime c = new Dime(2025);
		String expectedOutput = "[Dime,0.10,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'F_Roosevelt','Torch_Branches','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','ONE DIME',ridges"
	    + ",'Cupro-Nickel']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Dime

		Dime c1 = new Dime(2025, new Copper());
		String expectedOutput1 = (new Copper()).smelt();
		if(!c1.getMetallurgy().equals(expectedOutput1)) fail("Dime metallurgy constructer failed");

		Dime c = new Dime(2025);
		String expectedOutput = (new CuproNickel()).smelt();
		assertEquals(expectedOutput, c.getMetallurgy());
    }
}