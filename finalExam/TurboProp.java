package finalExam;

public class TurboProp extends ComAircraft{
    boolean pressurized;
    int numPassengers;
    String reg;
    int nEngines = 2;

    TurboProp(String sReg, int nEngines,int nPassengers, boolean bPressurized) { 
        super(sReg, nEngines, nPassengers);
        if(nEngines > 4)
        {
            nEngines = 2;
        }
        this.nEngines = nEngines;
        numPassengers = nPassengers;
        reg = sReg;
        pressurized = bPressurized;
    }

    TurboProp(String sReg, boolean bPressurized) {
        super(sReg);
        pressurized = bPressurized;
    }

    @Override
    public int getToLength() {
        if(nEngines == 2)
            return 2800;
        else if(nEngines == 3)
            return 3500;
        else if(nEngines == 4)
            return 4200;
        else
            return 0;
    }

    @Override
    public boolean isPressurized() {
        if(pressurized)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TurboProp [pressurized=" + pressurized + ", numPassengers=" + numPassengers + ", reg=" + reg + "]";
    }
}
