
import java.util.*;
public class Ignition {

    
    public Ignition() {
	State = 0;
    }
    private int State;

    private float Threshold_Electrical_Pulse;

    public int Find_State() {
        return State;
    }

    public boolean Check_Condition() {
        return false;
    }

    public int Stimulate_Ignition() {
	   Automobile obj1 = new Automobile();
        if(obj1.Start() == true)
		State = 1;
        else
		State = 0;
        return State;
    }

    public int Destimulate_Ignition() {
        Automobile obj1 = new Automobile();
        if(obj1.Stop() == true)
		State = 0;
        else
		State = 1;
        return State;
    }

}
