package practice_test_DEC_2;

public abstract class SuperFastTrains extends Train
{
    int maxSpeed;
    EngineType engineType;
    TrackTypes tType;
    int wagonCapacity;

    public void setWagonCapacity(int wagonCapacity) {
        this.wagonCapacity = wagonCapacity;
    }

    public void settType(TrackTypes tType) {
        this.tType = tType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SuperFastTrains(String name,String code ,int power , int maxSpeed) {
        super(name, power);

        if (engineType == EngineType.Electric){
            settType(TrackTypes.HighSpeed);
            setWagonCapacity(20);
        }

        if (maxSpeed >= 200 && maxSpeed <= 500 )
        {
            setMaxSpeed(maxSpeed);
        }
        else {
            setMaxSpeed(200);
        }

        if (power < 5000)
        {
            setPower(5000);
        }

        if (power > 15000)
        {
            setPower(15000);
        }

        if (code.startsWith("FT") && code.length() >= 5)
        {
            setCode(code);
        }
        else {
            setCode("FTBAD");
        }
    }

    @Override
    public String toString() {
        return "SuperFastTrains{" +
                "maxSpeed=" + maxSpeed +
                ", engineType=" + engineType +
                ", tType=" + tType +
                ", wagonCapacity=" + wagonCapacity +
                ", power=" + power +
                ", code='" + code + '\'' +
                '}';
    }
}
