
import java.util.*;

public class DriverAcquaintance extends User {

    public DriverAcquaintance() {
    }

    private String Relation;

    private String Blood_Group;

    public Location Detect_Driver_Location() {
        Location obj1 = new Location();
        return obj1;
    }

    public void Send_Notification(boolean notify) {
		if(notify == true){
			System.out.println("Driver has met with an accident. Arrange for emergency");
		}
		else{
			System.out.println("Driver Drunk");
		}
    }

}
