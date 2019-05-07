/*Maia Mandel
2019. 02. 19
Ms. Krasteva
This is the airplane class that shows we read through the booklet.*/

public class Airplane 
{

    int gasLevel;
    String landingGear;
    String doorStatus;
    int passengers;

    public Airplane ()
    {
	/*@param gasLevel sets the gasLevel to 100*/
	gasLevel = 100;
	/*@param landingGear sets the landingGear to "Down"*/
	landingGear = "Down";
	/*@param doorStatus sets the doorStatus to "Open"*/
	doorStatus = "Open";
	/*@param passengers sets the passengers to 100*/
	passengers = 100;
}
	//sets the door to be open
	public void openDoor ()
	{
	    doorStatus = "Open";
	}
	//sets the door to be closed
	public void closeDoor ()
	{
	    doorStatus = "Closed";
	}
	//sets the gas level to full
	public void fillUp ()
	{
	    gasLevel = 100;
	}
	//sets the gas level back 30
	public void takeOff ()
	{
	    gasLevel -= 30;
	}
	//makes the landing gear go up
	public void doneTakeOff ()
	{
	    landingGear = "Up";
	}
	//sets the percentage
	public void normalFlight (int percent)
	{
	    percent = percent - gasLevel;
	}
	//makes the landing gear go down
	public void prepLanding ()
	{
	    landingGear = "Down";
	}
	//sets the gas back 15 because of the landing
	public void land ()
	{
	    gasLevel -= 15;
	}
	//loads the passengers
	public void loadPass (int pass)
	{
	    passengers = pass + passengers;
	}
	//sets the passengers to 0
	public void unloadPass ()
	{
	    passengers = 0;
	}
	//returns the gas levels
	public int getGasLevel ()
	{
	    return (gasLevel);
	}
	//returns the door status
	public String getDoorStatus ()
	{
	    return (doorStatus);
	}
	//returns the psssengers
	public int getPassengers ()
	{
	    return (passengers);
	}
	//returns the landing gear
	public String getLandingGear ()
	{
	    return (landingGear);
	}
	public static void main (String[] args)
	{
	    Airplane a = new Airplane ();
	    a.openDoor ();
	    a.closeDoor ();
	    a.fillUp ();
	    a.takeOff ();
	    a.doneTakeOff ();
	    a.normalFlight (50);
	    a.land ();
	    a.loadPass (50);
	    a.unloadPass ();
	    a.getGasLevel ();
	    a.getDoorStatus ();
	    a.getPassengers ();
	    a.getLandingGear ();

	}
    }


