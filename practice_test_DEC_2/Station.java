package practice_test_DEC_2;

import java.util.ArrayList;

public class Station
{
    private String name;
    private int totalSharedTracks;
    private int totalHighSpeed;
    private ArrayList<Train> trainList;
    private int altitude;

    public Station(String name, int totalSharedTracks, int totalHighSpeed, int altitude) {
        this.name = name;
        this.totalSharedTracks = totalSharedTracks;
        this.totalHighSpeed = totalHighSpeed;
        this.altitude = altitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSharedTracks(int totalSharedTracks) {
        this.totalSharedTracks = totalSharedTracks;
    }

    public void setTotalHighSpeed(int totalHighSpeed) {
        this.totalHighSpeed = totalHighSpeed;
    }

    public void setTrainList(ArrayList<Train> trainList) {
        this.trainList = trainList;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getTracks (TrackTypes type)
    {
        return totalSharedTracks;
    }

    public int atStation (TrackTypes type)
    {
        return 0;
    }

    public int availableTracks(TrackTypes type){
        return 0;
    }

    public boolean canArrive (Train obOther){
        return false;
    }

    public boolean depart (Train obOther){
        return false;
    }

    public ArrayList<Train> getTrainList() {
        return trainList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", totalSharedTracks=" + totalSharedTracks +
                ", totalHighSpeed=" + totalHighSpeed +
                ", altitude=" + altitude +
                '}';
    }
}
