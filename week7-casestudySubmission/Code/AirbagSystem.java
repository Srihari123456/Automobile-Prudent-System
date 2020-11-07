
import java.util.*;

public class AirbagSystem implements AccidentDetector {

    
    public AirbagSystem() {
	isEjected = false;
    }

    private static final float Threshold_Torque = 1.8;

    private float Response_Time;

    private boolean isEjected;

    private boolean Check_Airbag_State(torque) {
	if(Torque > Threshold_Torque) isEjected = true;
	else isEjected = false;
        return isEjected;
    }

    public int Detect_State() {
        if(isEjected == true)return 1;
        return 0;
    }

    public void Signal_Circuit() {
        // TODO implement here
    }

    public void Check_Accident(float torque) {
        while(Check_Airbag_State(torque) == true);
	   GSM_Module obj1 = new GSM_Module();
		obj1.Report_Accident();

    }

}
