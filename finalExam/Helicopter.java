package finalExam;

public class Helicopter extends ComAircraft {
    boolean ditchCapable = false;
    boolean softLander = false;
    int numPassengers = 4;
    String reg;
    int nEngines = 1;

    Helicopter(String sReg, int nEngines, int nPassengers, boolean bDitchCapable, boolean bSoftLander) {
        super(sReg, nEngines, nPassengers);
        if (nEngines > 2) {
            nEngines = 1;
        }
        this.nEngines = nEngines;
        numPassengers = nPassengers;
        reg = sReg;
        ditchCapable = bDitchCapable;
        softLander = bSoftLander;
    }

    Helicopter(String sReg, int nEngines) {
        super(sReg, nEngines);
        this.nEngines = nEngines;
        reg = sReg;
    }

    public boolean isDitchCapable() {
        return ditchCapable;
    }

    public boolean isSoftLander() {
        return softLander;
    }

    @Override
    public int getToLength() {
        return 0;
    }

    @Override
    public boolean isPressurized() {
        return false;
    }

    @Override
    public String toString() {
        return "Helicopter [ditchCapable=" + ditchCapable + ", softLander=" + softLander + ", numPassengers="
                + numPassengers
                + ", reg=" + reg + "]";
    }
}
