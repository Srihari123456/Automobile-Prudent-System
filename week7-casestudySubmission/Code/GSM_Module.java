
import java.util.*;

public class GSM_Module {

    
    public GSM_Module() {
	Accident_Bit = false;
    }

    private String Standard;

    private long FD_Number;

    private String Embedded_AT_Commands;

    private boolean Accident_Bit;

    public Location Send_Location() {
        Location CurrentLoc = new Location();
	   return CurrentLoc.Get_Location();
    }

    public void Report_Accident() {
		DriverAcquaintance obj2 = new DriverAcquaintance();
		Accident_Bit = true;
		Obj2.Send_Notification(Accident_Bit);
    }

    public void Report_Intoxication() {
		DriverAcquaintance obj1 = new DriverAcquaintance();
		Accident_Bit = false;
		Obj1.Send_Notification(Accident_Bit);

    }

}
