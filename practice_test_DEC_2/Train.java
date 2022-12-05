package practice_test_DEC_2;

public abstract class Train {
    public int power;
    private String name;
    protected String code;


    public Train(String name, int power) {
        this.power = power;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract TrackTypes[] getTrackType();

    public abstract EngineType getEngineType();

    public abstract int getWagonCapacity();

    public boolean canRunOn(TrackTypes type){
        return false;
        }

    public boolean equals (Object obOther ){

        if (obOther instanceof Train && getCode().equals(((Train) obOther).getCode()) ){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", Wagon capacity=" + getWagonCapacity() + '\'' +
                ", Engine type="+ getEngineType() + '\'' +
                '}';
    }
}

