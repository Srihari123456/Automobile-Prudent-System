
import java.util.*;

public class Circuit {

    
    public Circuit() {
	State = 0;
    }
    private double RF_Received_Signal;
    private int State;
    public void Convert_to_State() {
        // TODO implement here
    }
    public int Trigger_Circuit() {
	 Ignition obj1 = new Ignition();
	 if(obj1.Simulate_Ignition() != 0 || 
obj1.Destimulate_Ignition() != 1){
		State = 1;
	  }
	else
		State = 0;        
        return State;
    }

}
