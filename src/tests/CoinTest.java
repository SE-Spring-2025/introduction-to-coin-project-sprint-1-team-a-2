import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
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

	// make it here then didn't fail!
	assertTrue(true);
    }

	@Test
    public void testGetters() {
		
		Coin c1 = new Penny();
		Coin c = ((Penny) c1).manufacture((Penny) c1);
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
		Coin c1 = new Penny();
		Coin c = ((Penny) c1).manufacture((Penny) c1);
		String expectedOutput = "[Penny,0.01,2025,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'A_Lincoln','Lincoln_Memorial','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','ONE CENT',no ridges"
	    + ",'Copper']";
		assertEquals(expectedOutput, c.toString());
    }

	@Test
    public void testSmelt() {
		//test smelt using Penny
		Penny c = new Penny(new CuproNickel());
		Penny c1 = c.manufacture(c);
		String expectedOutput1 = (new CuproNickel()).smelt();
		if(!c1.getMetallurgy().equals(expectedOutput1)) fail("Penny metallurgy constructer failed");

		Penny c2 = new Penny();
		Penny c3 = c2.manufacture(c2);
		String expectedOutput = (new Copper()).smelt();
		assertEquals(expectedOutput, c3.getMetallurgy());

		
    }

	@Test
	public void testCoinCounts() {
		if(Coin.getCoinCounter().totalCoins != 0) fail("totalCoins counter should be 0.");
		new Penny();
		if(Coin.getCoinCounter().totalCoins != 1) fail("totalCoins counter should be 1.");
		assertTrue(true);
	}
}
    
