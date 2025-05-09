import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.*;

public class HalfDollarTest {
	@Test
    public void testConstructors() {
	//testing HalfDollar constructor 
	// parameterless constructor
	try {
	    HalfDollar c = new HalfDollar();
	}
	catch (Exception e) {
	    fail("HalfDollar() constructor caused exception: "+e.getMessage());
	}

	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		HalfDollar c1 = new HalfDollar();
		HalfDollar c = c1.manufacture(c1);
		if(c.getValue() != 0.50) fail("value getter failed");
		if(!c.getFamiliarName().equals("HalfDollar")) fail("xommon name getter failed");
		if(!c.getFrontMotto().equals("IN GOD WE TRUST")) fail("front motto getter failed");
		if(!c.getBackMotto().equals("E PLURIBUS UNUM")) fail("back motto getter failed");
		if(!c.getFrontLabel().equals("LIBERTY")) fail("front label getter failed");
		if(!c.getBackLabel().equals("UNITED STATES OF AMERICA")) fail("back label getter failed");
		if(!c.getFrontImage().equals("J_Kennedy")) fail("front image getter failed");
		if(!c.getBackImage().equals("Presidential_Seal")) fail("back image getter failed");
		if(!c.getValueDescription().equals("HALF DOLLAR")) fail("value description getter failed");
		if(c.getRidgedEdge() != true) fail("value description getter failed");
		if(!c.getMetallurgy().equals("Cupro-Nickel")) fail("metallurgy getter failed");
		if(c.getYear() != 2025) fail("value description getter failed");
	
	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testToString() {
		//test toString using HalfDollar
		HalfDollar c1 = new HalfDollar();
		HalfDollar c = c1.manufacture(c1);
		String expectedOutput = "[HalfDollar,0.50,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'J_Kennedy','Presidential_Seal','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','HALF DOLLAR',ridges"
	    + ",'Cupro-Nickel']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Dollar
		HalfDollar c1 = new HalfDollar(new Copper());
		HalfDollar c = c1.manufacture(c1);
		String expectedOutput1 = (new Copper()).smelt();
		if(!c1.getMetallurgy().equals(expectedOutput1)) fail("HalfDollar metallurgy constructer failed");

		HalfDollar c2 = new HalfDollar();
		HalfDollar c3 = c2.manufacture(c2);
		String expectedOutput = (new CuproNickel()).smelt();
		assertEquals(expectedOutput, c3.getMetallurgy());
    }
}
