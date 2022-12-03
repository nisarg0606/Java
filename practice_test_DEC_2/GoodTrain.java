package practice_test_DEC_2;

public abstract class GoodTrain extends Train
{
    int maxAltitude;

    int wagonCapacity;

    @Override
    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setWagonCapacity(int wagonCapacity) {
        this.wagonCapacity = wagonCapacity;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public GoodTrain(String name, int power,String code , int nAltitude) {
        super(name, power);

        if (maxAltitude <= 3000)
        {
            setMaxAltitude(maxAltitude);
        }
        else {
            setMaxAltitude(1000);
        }

        if (power < 4000)
        {
            setPower(4000);
        }

        if (power > 10000)
        {
            setPower(10000);
        }

        if (power >= 4000 && power <= 6000){
            setWagonCapacity(20);
        }
        else if (power >= 6001 && power <= 8000) {
            setWagonCapacity(40);
        } else if (power >= 8001 && power <= 10000) {
            setWagonCapacity(60);
        }

        if (code.startsWith("GT") && code.length() >= 5){
            setCode(code);
        }
        else{
            code = "GTBAD";
        }

    }
}
