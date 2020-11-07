
import java.util.*;
import java.lang.*;
public class Location {

    
    public Location() {
    }
public Location(float lat, float lon) {
	this.Latitude = lat;
	this.Longitude = lon; 
}

    private float Latitude;

    private float Longitude;

    public Location Get_Location() {
        return this;
    }

    public boolean Is_Valid_Location() {
        if(Latitude < -90 || Latitude > 90 ||
			 Longitude < -180 || Longitude > 180)
	        return false;
	  return true;
    }
    public float CalculateDistance(Location Destination) {
        float lon1 = Math.toRadians(this.Longitude); 
        float lon2 = Math.toRadians(Destination.Longitude); 
        float lat1 = Math.toRadians(this.Latitude); 
        float lat2 = Math.toRadians(Destination.Latitude); 
  
        float dlon = lon2 - lon1;  
        float dlat = lat2 - lat1; 
        double a = Math.pow(Math.sin(dlat / 2), 2) 
                 + Math.cos(lat1) * Math.cos(lat2) 
                 * Math.pow(Math.sin(dlon / 2),2); 
              
        float c = 2 * Math.asin(Math.sqrt(a)); 
  
        // Radius of earth in kilometers. 
        float r = 6371; 
  
        // calculate the result 
        return(c * r);
    }

}
