package finalExam;

public abstract class ComAircraft
{
    int numEngines = 4;
    int numPassengers = 100;
    String reg;

    ComAircraft(String sReg, int nEngines, int nPassenger)
    {
        reg = sReg;
        numEngines = nEngines;
        numPassengers = nPassenger;
    }

    ComAircraft(String sReg, int nEngines)
    {
        reg = sReg;
        numEngines = nEngines;
    }

    ComAircraft(String sReg)
    {
        reg = sReg;
    }

    public int getNumPassengers()
    {
        return numPassengers;
    }

    public int getNumEngines()
    {
        return numEngines;
    }

    public abstract int getToLength();

    public abstract boolean isPressurized();

    public boolean equals(ComAircraft other)
    {
        if (other == null)
        {
            return false;
        }
        if (this == other)
        {
            return true;
        }
        if (this.getClass() != other.getClass())
        {
            return false;
        }
        if (this.reg.equals(other.reg))
        {
            return true;
        }
        return false;
    }
    {

    }
    public String toString()
    {
        return "Reg: " + reg + " NumEngines: " + numEngines + " NumPassengers: " + numPassengers;
    }
}
