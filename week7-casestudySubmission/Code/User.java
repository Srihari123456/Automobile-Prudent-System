
import java.util.*;

public abstract class User {
   static Scanner input = new Scanner(System.in);
    public User() {
    }

    protected String Username;

    protected String Password;

    protected String Name;

    protected long Aadhar_Number;

    protected long Contact_Number;

    public Location Request_Destination() {
     	Location Destination = new Location(input.nextFloat(),input.nextFloat());
	return Destination;
    }

}
