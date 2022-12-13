package finalExam;

import java.util.ArrayList;

public class AirPort
{
    int altitude;
    int stripLength;
    int maxPassengers;
    ArrayList<ComAircraft> aircraft = new ArrayList<ComAircraft>();


    AirPort(int nAltitude, int nStripLength, int nMaxPassengers)
    {
        altitude = nAltitude;
        stripLength = nStripLength;
        maxPassengers = nMaxPassengers;
    }

    public boolean canLand(ComAircraft aircraft)
    {
        if(aircraft.getToLength() <= stripLength && aircraft.getNumPassengers() <= maxPassengers)
        {
            return true;
        }
        return false;
    }
    //•	The method getAircraftList will return the ArrayList of aircraft that can land at a particular field.
    public ArrayList<ComAircraft> getAircraftList()
    {
        return aircraft;
    }

    public int getAltitude()
    {
        return altitude;
    }

    public boolean addAircraft(ComAircraft aircraft)
    {
        if(canLand(aircraft))
        {
            this.aircraft.add(aircraft);
            return true;
        }
        return false;
    }
}
