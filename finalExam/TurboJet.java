package finalExam;

public class TurboJet extends ComAircraft{
    boolean international;
    int numPassengers;
    String reg;
    int nEngines = 2;

    TurboJet(String sReg, int nEngines,int nPassengers, boolean bInternational) { 
        super(sReg, nEngines, nPassengers);
        if(nEngines > 4)
        {
            nEngines = 2;
        }
        this.nEngines = nEngines;
        numPassengers = nPassengers;
        reg = sReg;
        international = bInternational;
    }

    TurboJet(String sReg, int nEngines)
    {
        super(sReg, nEngines);
        this.nEngines = nEngines;
        reg = sReg;
        if(nEngines == 4)
        {
            international = true;
        }
        else if(nEngines == 2)
        {
            international = false;
        }
    }

    public boolean isInternational() {
        return international;
    }

    @Override
    public int getToLength() {
        if(nEngines == 2)
            return 3600;
        else if(nEngines == 4)
            return 4800;
        else
            return 0;
    }

    @Override
    public boolean isPressurized() {
        return true;
    }

    @Override
    public String toString() {
        return "TurboJet [international=" + international + ", numPassengers=" + numPassengers + ", reg=" + reg + "]";
    }

    
}
