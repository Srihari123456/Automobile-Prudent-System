
import java.util.*;

public class SafetyApplication {

    public SafetyApplication() {
    }
    private String Name;

    private String Version;

    public void Login() {
        // TODO implement here
    }

    public void Update_Details() {
        // TODO implement here
    }

    public void Change_Password() {
        // TODO implement here
    }

    public boolean Make_Payment() {
        // TODO implement here
        return false;
    }
    public void Plan_Trip() {
		GSM_Module obj1 = new GSM_Module();
		Location CurrentLoc = obj1.Send_Location();
		
		Driver obj2 = new Driver();
		Location Destination = obj2.Request_Destination();

		while(Destination.Is_Valid_Location() == false){
			Destination = obj2.Request_Destination();
		}
	
		float distance = CurrentLoc.Calculate_Distance(Destination);
		System.out.println("Your desired destination is " +distance+" kms away from here");
    }

}
