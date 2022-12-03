package practice_test;

public class ShifterTrains extends Train  implements Rescuers {
    // create an attribute to store the engine type from the possible engine types
    // listed in the EngineType enumeration [1 mark]
    EngineType engineType;
    // create an attribute to store the wagon capacity [1 mark]
    int wagonCapacity;

    // ShifterTrains (name: String, code: String) -> the constructor which
    // initialises
    public ShifterTrains(String name, String code) {
        // a. the engine type to be DieselMechanical [1 mark]
        // b. wagon capacity of 40 wagons. [1 mark]
        // c. The power for these trains must be 3000 [1 mark]
        // d. The train code must start with “ST” and should be at least of having a
        // length of 5 characters in total including the “ST”. If the code does not have
        // the mentioned format, then the code should be initialized to “STBAD”. [2
        // marks]
        super(name, 3000);
        engineType = EngineType.DieselMechanical;
        wagonCapacity = 40;
        if (code.startsWith("ST") && code.length() == 5) {
            setCode(code);
        } else {
            setCode("STBAD");
        }

        this.code = (code.startsWith("ST") && code.length() == 5) ? code : "STBAD";

    }

    // Override all the 3 abstract methods from Train class appropriately [3 marks]
    @Override
    public TrackTypes[] getTrackType() {
        return new TrackTypes[0];
    }

    @Override
    public EngineType getEngineType() {
        return null;
    }

    @Override
    public int getWagonCapacity() {
        return 0;
    }

    // Override the toString () method which makes use of the Train toString ()
    @Override
    public String toString() {
        return "ShifterTrains{" + super.toString() +
                "engineType=" + engineType +
                ", wagonCapacity=" + wagonCapacity +
                '}';
    }

    @Override
    public boolean canCommandeer() {
        if (getPower() >= REQ_HORSE) {
            return true;
        } else {
            return false;
        }
    }
}
