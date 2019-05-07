public class Build_A_Bear
{
    private String name;
    private String animal;
    private String color;
    private String birthday;
    private String clothes;
    private String shoes;
    private boolean song;
    private String scent;
    private boolean accessories;
    private int condition;

    public Build_A_Bear (String n)
    {
	name = n;
	animal = "bear";
	color = "brown";
	birthday = "April 29, 2003.";
	clothes = "shirt";
	shoes = "none";
	song = false;
	scent = "none";
	accessories = false;
	condition = 100;
    }


    public Build_A_Bear (String n, String a, String c, String bd, String cl, String sh, boolean so, String sc, boolean ac)
    {
	name = n;
	animal = a;
	color = c;
	birthday = bd;
	clothes = cl;
	shoes = sh;
	song = so;
	scent = sc;
	accessories = ac;
	condition = 100;
    }


    public void setName (String n)
    {
	name = n;
    }


    public void setFriend (String a, String c)
    {
	animal = a;
	color = c;
    }


    public void setBirthDay (String bd)
    {
	birthday = bd;
    }


    public void setOutfit (String cl, String sh)
    {
	clothes = cl;
	shoes = sh;
    }


    public void setSound (boolean so)  //revisit
    {
	song = so;
    }


    public void setScent (String sc)
    {
	scent = sc;
    }


    public void addAccessories (boolean ac)
    {
	accessories = ac;
    }


    public void play ()
    {
	condition -= 5;
    }


    public void broken ()
    {
	condition -= 50;
    }


    public void repair ()
    {
	condition = 100;
    }


    public String getName ()
    {
	return (name);
    }


    public String getFriend ()
    {
	return (color);
    }


    public String getBirthday ()
    {
	return (birthday);
    }


    public String getOutfit ()
    {
	return (clothes);
    }


    public boolean getSound ()
    {
	return (song);
    }


    public String getScent ()
    {
	return (scent);
    }
}

