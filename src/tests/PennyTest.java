import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.Copper;
import main.Penny;

public class PennyTest {
	@Test
    public void testConstructors() {
	//testing Penny constructor
	// parameterless constructor
	try {
	    Penny c = new Penny();
	}
	catch (Exception e) {
	    fail("Penny() constructor caused exception: "+e.getMessage());
	}

	// year arg constructor
	try {
	    Penny c = new Penny(2025);
	}
	catch (Exception e) {
	    fail("Penny() constructor caused exception: "+e.getMessage());
	}


	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Penny c = new Penny(2025);
		if(c.getValue() != 0.01) fail("value getter failed");
		if(!c.getFamiliarName().equals("Penny")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("A_Lincoln")) fail("front image getter failed");
		if(!c.getBackImage().equals("Lincoln_Memorial")) fail("back image getter failed");
		if(!c.getValueDescription().equals("ONE CENT")) fail("value description getter failed");
		if(c.getRidgedEdge() != false) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Copper")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using penny
		Penny c = new Penny(2025);
		String expectedOutput = "[Penny,0.01,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'A_Lincoln','Lincoln_Memorial','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','ONE CENT',no ridges"
	    + ",'Copper']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Penny
		Penny c = new Penny(2025);
		String expectedOutput = (new Copper()).smelt();
		assertEquals(expectedOutput, c.getMetallurgy());
    }
}
