package practice_test;

public class GoodsTrain extends Train implements Rescuers {
    // 1. Create an attribute named maxAltitude: int to store the maximum altitude
    // that the train can go [1 mark]
    int maxAltitude;
    int wagonCapacity;

    // EngineType engineType;
    // TrackTypes[] trackTypes;
    // 2. Create a getter for altitude [1 mark]
    public int getMaxAltitude() {
        return maxAltitude;
    }

    // 3. GoodsTrains (name: String, code: String, power: int, nAltitude: int) ->
    // the constructor which initializes
    public GoodsTrain(String name, String code, int power, int nAltitude) {
        // a. The altitude as specified. The maximum altitude possible for these trains
        // is 3000. The altitude shall be set to 1000 if specified incorrectly [2 marks]
        super(name, power);
        if (nAltitude > 3000) {
            maxAltitude = 1000;
        } else {
            maxAltitude = nAltitude;
        }
        // b. The power of these trains must range between 4000 and 10000. Any thing
        // specified below will set the power to lowest possible and in case specified
        // to be higher than range, will specify to the maximum possible power. [1 mark]
        if (power < 4000) {
            setPower(4000);
        } else if (power > 10000) {
            setPower(10000);
        }
        // c. The wagon capacity depends on the power of the train and is listed below
        // [3 marks]
        // i. Power between 4000 to 6000: 20 wagons
        // ii. Power between 6000 to 8000: 40 wagons
        // iii. Power between 8000 to 10000: 60 wagons
        if (power >= 4000 && power <= 6000) {
            wagonCapacity = 20;
        } else if (power >= 6001 && power <= 8000) {
            wagonCapacity = 40;
        } else if (power >= 8001 && power <= 10000) {
            wagonCapacity = 60;
        }
        // d. The train code must start with “GT” and should be at least of having a
        // length of 5 characters in total including the “GT”. If the code does not have
        // the mentioned format, then the code should be initialized to “GTBAD”. [2
        // marks]
        if (code.startsWith("GT") && code.length() >= 5) {
            setCode(code);
        } else {
            setCode("GTBAD");
        }
    }

    @Override
    public TrackTypes[] getTrackType() {
        TrackTypes[] trackTypes = {TrackTypes.SharedUse, TrackTypes.UrbanTrunk };
        return trackTypes;
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.DieselMechanical;
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
        