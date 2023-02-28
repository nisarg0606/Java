package assignment2;

public class RAddress {
    private String aAddress;
    private String aCity;
    private int nBeds;
    private int nBaths;
    private int nSqaure;
    private String aType;
    private double dPrice;

    public RAddress(String aAddress, String aCity, int nBeds, int nBaths, int nSqaure, String aType, double dPrice) {
        this.aAddress = aAddress;
        this.aCity = aCity;
        this.nBeds = nBeds;
        this.nBaths = nBaths;
        this.nSqaure = nSqaure;
        this.aType = aType;
        this.dPrice = dPrice;
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress;
    }

    public String getaCity() {
        return aCity;
    }

    public void setaCity(String aCity) {
        this.aCity = aCity;
    }

    public int getnBeds() {
        return nBeds;
    }

    public void setnBeds(int nBeds) {
        this.nBeds = nBeds;
    }

    public int getnBaths() {
        return nBaths;
    }

    public void setnBaths(int nBaths) {
        this.nBaths = nBaths;
    }

    public int getnSqaure() {
        return nSqaure;
    }

    public void setnSqaure(int nSqaure) {
        this.nSqaure = nSqaure;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    public double getdPrice() {
        return dPrice;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    @Override
    public String toString() {
        return "RAddress [aAddress=" + aAddress + ", aCity=" + aCity + ", aType=" + aType + ", dPrice=" + dPrice
                + ", nBaths=" + nBaths + ", nBeds=" + nBeds + ", nSqaure=" + nSqaure + "]";
    }
}
