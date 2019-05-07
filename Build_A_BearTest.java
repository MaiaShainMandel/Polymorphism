// The "Build_A_BearTest" class.
import java.awt.*;
import hsa.Console;

public class Build_A_BearTest
{
    public static void main (String[] args)
    {
	Build_A_Bear b = new Build_A_Bear ("Teddy");
	b.setName ("Teddy");
	b.setFriend ("Bear", "Brown");
	b.setBirthDay ("May 3, 2014.");
	b.setOutfit ("Dress", "Sandles");
	b.setSound (true);
	b.setScent ("Roses");
	b.addAccessories (true);
	System.out.println (b.getName ());
	System.out.println (b.getFriend ());
	System.out.println (b.getBirthday ());
	System.out.println (b.getOutfit ());
	System.out.println (b.getSound ());
	System.out.println (b.getScent ());
	Build_A_Bear b2 = new Build_A_Bear ("Bananaz");
	b2.setName ("Bananaz");
	b2.setFriend ("Monkey", "Brown");
	b2.setBirthDay ("April 29, 2003.");
	b2.setOutfit ("Jumpsuit", "Sneakers");
	b2.setSound (true);
	b2.setScent ("Flowers");
	b2.addAccessories (false);
	System.out.println (b2.getName ());
	System.out.println (b2.getFriend ());
	System.out.println (b2.getBirthday ());
	System.out.println (b2.getOutfit ());
	System.out.println (b2.getSound ());
	System.out.println (b2.getScent ());
    } // main method
} // Build_A_BearTest class
