package aarsh.collection.TrafficControlSystem;

public class Car {
    private String licensePlate;
    private long arrivalTime;
    private long waitingTime;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.arrivalTime = System.currentTimeMillis();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public long getWaitingTime() {
        return System.currentTimeMillis() - arrivalTime;
    }

    public void setWaitingTime(long waitingTime) {
        this.waitingTime = waitingTime;
    }
}
