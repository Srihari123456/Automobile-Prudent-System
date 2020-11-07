
import java.util.*;

public class LevelDetector implements AccidentDetector {

    
    public LevelDetector() {
	IsDanger = false;
    }
    private float Dimensions;

    private float Skid_Angle;

    private boolean IsDanger;

    private boolean Check_Angle(float Threshold_Angle) {
        if(Skid_Angle < Threshold_Angle)
        		return true;
	return false;
    }

    public int Detect_State() {
        if(IsDanger == true)return 1;
        return 0;
    }

    public void Signal_Circuit() {
        // TODO implement here
    }

    public void Check_Accident(float Threshold_Angle) {
		while(Check_Angle(Threshold_Angle) == true);
		IsDanger = true;
		GSM_Module obj1 = new GSM_Module();
		obj1.Report_Accident();
    }

}
