
import java.util.*;

public abstract class Automobile {

    
    public Automobile() {
	Service_Status = false;
    }

    
    protected String Registration_Number;

    protected String Insurance_ID;

    protected boolean Service_Status;


    public boolean Start() {
        // TODO implement here
        return false;
    }

    public boolean Stop() {
        // TODO implement here
        return false;
    }

    public boolean Fix_Service_Date(String date) {
	  ServiceProvider obj1 = new ServiceProvider();
	  return COnfirm_Service_Date(date);
    }

    public boolean Check_Service_Status() {
        return Service_Status;
    }

    
    public void Update_Service_Status(boolean state) {
		this.Service_Status = state;
    }

}
