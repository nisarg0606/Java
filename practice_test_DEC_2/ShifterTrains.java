package practice_test_DEC_2;

import javax.lang.model.util.ElementScanner6;

public class ShifterTrains extends Train implements Rescuers
{

    EngineType engineType;
    int wagonCapacity;

    public ShifterTrains(String name, String code) {
        super(name , 3000);
        engineType = EngineType.DieselMechanical;
        wagonCapacity = 40;

        if (code.startsWith("ST") && code.length() == 5){
            setCode(code);
        }
        else {
            setCode("STBAD");
        }

//         this.code = (code.startsWith("ST") && code.length() == 5) ? code : "STBAD";

    }

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

    @Override
    public String toString() {
        return "ShifterTrains{" + super.toString() +
                "engineType=" + engineType +
                ", wagonCapacity=" + wagonCapacity +
                '}';
    }

    @Override
    public boolean canCommandeer() {
        // TODO Auto-generated method stub
        return false;
    }
}
