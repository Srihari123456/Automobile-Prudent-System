
import java.util.*;

public class AlcoholSensor extends Sensor {

    public AlcoholSensor() {
    }

    private float Intoxication_Level;

    private float Active_Temperature;

    private float Optimum_Power;

    private static float Threshold_Intoxication = 0.6;

    public boolean Check_If_Drunk() {
        if(Intoxication_Level < Threshold_Intoxication)
		return false;
        else{
		Circuit obj1 = new Circuit();
		if(obj1.Trigger_Circuit() != 0){
			GSM_Module obj2 = new GSM_Module();
			Obj2.Report_Intoxication();
}
		return true;
        }
    }

}
