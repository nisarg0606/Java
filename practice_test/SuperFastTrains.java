package practice_test;

/*
 * Perform the following with this class:
1.	Create an attribute named maxSpeed: int to store the maximum speed that the train can move at [1 mark]
2.	Create a getter for maxSpeed [1 mark]
3.	GoodsTrains (name: String, code: String, power: int, maxSpeed: int) -> the constructor which initializes
a.	The engine type to be Electric, track to be HighSpeed and wagons to be 20 [3 marks]
b.	The maxSpeed as specified. The maximum speed possible for these trains is 200 to 500. The speed shall be set to lowest speed if specified incorrectly [2 marks]
c.	The power of these trains must range between 5000 and 15000. Any thing specified below will set the power to lowest possible and in case specified to be higher than range, will specify to the maximum possible power. [1 mark]
d.	The train code must start with “FT” and should be at least of having a length of 5 characters in total including the “FT”. If the code does not have the mentioned format, then the code should be initialized to “FTBAD”.  [2 marks]
e.	Override toString () appropriately for this class [12 marks]

 */
public class SuperFastTrains extends Train implements Rescuers {
    // 1. Create an attribute named maxSpeed: int to store the maximum speed that the train can move at [1 mark]
    int maxSpeed;
    int wagonCapacity;
    EngineType engineType;
    TrackTypes[] trackTypes;
    // 2. Create a getter for maxSpeed [1 mark]
    public int getMaxSpeed() {
        return maxSpeed;
    }
    // 3. GoodsTrains (name: String, code: String, power: int, maxSpeed: int) -> the constructor which initializes
    public SuperFastTrains(String name, String code, int power, int maxSpeed) {
        // a. The engine type to be Electric, track to be HighSpeed and wagons to be 20 [3 marks]
        super(name, power);
        engineType = EngineType.Electric;
        trackTypes = new TrackTypes[1];
        trackTypes[0] = TrackTypes.HighSpeed;
        wagonCapacity = 20;
        // b. The maxSpeed as specified. The maximum speed possible for these trains is 200 to 500. The speed shall be set to lowest speed if specified incorrectly [2 marks]
        if (maxSpeed < 200) {
            this.maxSpeed = 200;
        } else if (maxSpeed > 500) {
            this.maxSpeed = 500;
        } else {
            this.maxSpeed = maxSpeed;
        }
        // c. The power of these trains must range between 5000 and 15000. Any thing specified below will set the power to lowest possible and in case specified to be higher than range, will specify to the maximum possible power. [1 mark]
        if (power < 5000) {
            setPower(5000);
        } else if (power > 15000) {
            setPower(15000);
        }
        // d. The train code must start with “FT” and should be at least of having a length of 5 characters in total including the “FT”. If the code does not have the mentioned format, then the code should be initialized to “FTBAD”. [2 marks]
        if (code.length() < 5 || !code.startsWith("FT")) {
            setCode("FTBAD");
        } else {
            setCode(code);
        }
    }
    @Override
    public TrackTypes[] getTrackType() {
        return trackTypes;
    }
    @Override
    public EngineType getEngineType() {
        return engineType;
    }
    @Override
    public int getWagonCapacity() {
        return wagonCapacity;
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
