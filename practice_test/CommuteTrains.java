package practice_test;

public class CommuteTrains extends Train implements Rescuers {
    // 1.	Create an attribute named maxAltitude: int to store the maximum altitude that the train can go [1 mark]
    int maxAltitude;
    int wagonCapacity;
    EngineType engineType;
    TrackTypes[] trackType;
    // 2.	Create a getter for the altitude [1 mark]
    public int getMaxAltitude() {
        return maxAltitude;
    }
    // 3.	CommuteTrains (name: String, code: String, power: int, engine: EngineType) -> the constructor which initializes
    CommuteTrains(String name, String code, int power, EngineType engine) {
        // a.	The engine type to be Electirc or DieselElectric. If any other engine type is specified, then it uses DieselElectric as the default engine type [1 mark]
        // b.	If engine type is DieselElectric, then the train can run on only UrbanTrack or SharedTrack [1 mark]
        // c.	If engine type is Electric, then the train can run on only UrbanTrack lines [1 mark]
        // d.	The power of these trains must range between 1000 and 4000. Any thing specified below will set the power to lowest possible and in case specified to be higher than range, will specify to the maximum possible power. [1 mark]
        // e.	The wagon capacity depends on the power of the train and is listed below [3 marks]
        // i.	Power between 1000 to 2000: 8 wagons
        // ii.	Power between 2000 to 3000: 16 wagons
        // iii.	Power between 3000 to 4000: 20 wagons
        // f.	The maxAltitude depends on the engine type. For DieselElectric engines, it will be 1000 and for Electric, it will be 800 [1 mark]
        // g.	The train code must start with “CT” and should be at least of having a length of 5 characters in total including the “CT”. If the code does not have the mentioned format, then the code should be initialized to “CTBAD”.  [2 marks]
        super(name, power);
        if (engine == EngineType.Electric || engine == EngineType.DieselElectric) {
            engineType = engine;
        } else {
            engineType = EngineType.DieselElectric;
        }
        if (engineType == EngineType.DieselElectric) {
            trackType = new TrackTypes[] {TrackTypes.UrbanTrack, TrackTypes.SharedTrack};
        } else {
            trackType = new TrackTypes[] {TrackTypes.UrbanTrack};
        }

        // d.	The power of these trains must range between 1000 and 4000. Any thing specified below will set the power to lowest possible and in case specified to be higher than range, will specify to the maximum possible power. [1 mark]
        if (power < 1000) {
            setPower(1000);
        } else if (power > 4000) {
            setPower(4000);
        }

        // e.	The wagon capacity depends on the power of the train and is listed below [3 marks]
        // i.	Power between 1000 to 2000: 8 wagons
        // ii.	Power between 2000 to 3000: 16 wagons
        // iii.	Power between 3000 to 4000: 20 wagons
        if (power >= 1000 && power <= 2000) {
            wagonCapacity = 8;
        }
        if (power > 2000 && power <= 3000) {
            wagonCapacity = 16;
        }
        if (power > 3000 && power <= 4000) {
            wagonCapacity = 20;
        }

        // f.	The maxAltitude depends on the engine type. For DieselElectric engines, it will be 1000 and for Electric, it will be 800 [1 mark]
        if (engineType == EngineType.DieselElectric) {
            maxAltitude = 1000;
        } else {
            maxAltitude = 800;
        }

        // g.	The train code must start with “CT” and should be at least of having a length of 5 characters in total including the “CT”. If the code does not have the mentioned format, then the code should be initialized to “CTBAD”.  [2 marks]
        if (code.length() < 5 || !code.startsWith("CT")) {
            setCode("CTBAD");
        } else {
            setCode(code);
        }

        
}
    @Override
    public TrackTypes[] getTrackType() {
        return trackType;
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