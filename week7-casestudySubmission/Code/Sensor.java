
import java.util.*;

public abstract class Sensor {
    public Sensor() {
	State = 0;
    }
    protected int State;

    protected long Model_Number;

    protected String Manufacturing_Company;

    protected float Sensitivity;

    protected float Range;


    public void Activate() {
        State = 1;
    }

    public void Deactivate() {
        State = 0;
    }

}
