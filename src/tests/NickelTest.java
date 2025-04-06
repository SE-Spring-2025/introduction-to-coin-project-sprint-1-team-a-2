import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.CuproNickel;
import main.Nickel;

public class NickelTest {
	@Test
    public void testConstructors() {
	//testing Nickel constructor 
	// parameterless constructor
	try {
	    Nickel c = new Nickel();
	}
	catch (Exception e) {
	    fail("Nickel() constructor caused exception: "+e.getMessage());
	}

	// year arg constructor
	try {
	    Nickel c = new Nickel(2025);
	}
	catch (Exception e) {
	    fail("Nickel() constructor caused exception: "+e.getMessage());
	}


	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Nickel c = new Nickel(2025);
		if(c.getValue() != 0.05) fail("value getter failed");
		if(!c.getFamiliarName().equals("Nickel")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("T_Jefferson")) fail("front image getter failed");
		if(!c.getBackImage().equals("Jefferson_Memorial")) fail("back image getter failed");
		if(!c.getValueDescription().equals("FIVE CENTS")) fail("value description getter failed");
		if(c.getRidgedEdge() != false) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Cupro-Nickel")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using Nickel
		Nickel c = new Nickel(2025);
		String expectedOutput = "[Nickel,0.05,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'T_Jefferson','Jefferson_Memorial','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','FIVE CENTS',no ridges"
	    + ",'Cupro-Nickel']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Nickel
		Nickel c = new Nickel(2025);
		String expectedOutput = (new CuproNickel()).smelt();
		assertEquals(expectedOutput, c.getMetallurgy());
    }
}
