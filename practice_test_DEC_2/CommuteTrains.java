package practice_test_DEC_2;

import practice_test_DEC_2.EngineType;
import practice_test_DEC_2.TrackTypes;
import practice_test_DEC_2.Train;

public class CommuteTrains extends Train
{
    int maxAltitude;
    int wagonCapacity;

    TrackTypes tType;

    EngineType engineType;



    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public CommuteTrains(int power, String name,String code,EngineType engineType) {
        super(name, power);

        if (engineType == EngineType.Electric || engineType == EngineType.DieselElectric)
        {
            setEngineType(engineType);

            if (engineType == EngineType.Electric){
                setMaxAltitude(800);
                this.tType = TrackTypes.UrbanTrunk;
            }
        }
        else {
            setEngineType(EngineType.DieselElectric);
            setMaxAltitude(1000);
        }

        if( power < 1000){
            setPower(1000);
        }
        else {
            if ( power > 4000 ){
                setPower(4000);
            }
        }

        if (power >= 1000 && power <= 2000){
            this.wagonCapacity = 8;
        } else if (power >= 2001 && power <= 3000) {
            this.wagonCapacity = 16;
        }else if (power >= 3001 && power <= 4000) {
            this.wagonCapacity = 20;
        }

        if (code.startsWith("CT") && code.length() >= 5)
        {
            setCode(code);
        }
        else {
            setCode("CTBAD");
        }

    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
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
         return wagonCapacity;
    }
}
