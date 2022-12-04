package practice_test;

import java.util.ArrayList;
public class Station {
    // 1. – name: String -> Create this attribute to store the name of the station
    // [1 mark]
    String name;
    // 2. – totalSharedTracks: int -> Create this attribute to describe the number
    // of shared tracks at the station [1 mark]
    int totalSharedTracks;
    // 3. – totalHighSpeed: int -> Create this attribute to describe the number of
    // high-speed tracks at the station [1 mark]
    int totalHighSpeed;
    // 4. – trainList: ArrayList<Train> -> Create this attribute to describe the
    // trains that are currently at the station [1 marks]
    ArrayList<Train> trainList;
    // 5. – altitude: int -> Create this attribute to describe the altitude of
    // station in meters [1 mark]
    int altitude;

    // 6. Station (name: String, totalShared: int, totalHighSpeed: int, altitude:
    // int) -> constructor to initialise the members as specified and creating the
    // array list [1 mark]
    public Station(String name, int totalSharedTracks, int totalHighSpeed, int altitude) {
        this.name = name;
        this.totalSharedTracks = totalSharedTracks;
        this.totalHighSpeed = totalHighSpeed;
        this.altitude = altitude;
        this.trainList = new ArrayList<Train>();
    }

    // 7. getTracks (type: TrackType): int -> returns the total number of tracks for
    // the specified type [1 mark]
    public int getTracks(TrackTypes[] type) {
        int totalTracks = 0;
        for (TrackTypes trackType : type) {
            if (trackType == TrackTypes.SharedUse) {
                totalTracks += totalSharedTracks;
            } else if (trackType == TrackTypes.HighSpeed) {
                totalTracks += totalHighSpeed;
            }
        }
        return totalTracks;
    }

    // 8. atStation (type: TrackType): int -> from all the trains currently at the
    // station, this method returns the number of trains that uses the specified
    // track type [2 marks]
    public int atStation(TrackTypes[] type) {
        int totalTrains = 0;
        for (Train train : trainList) {
            for (TrackTypes trackType : type) {
                if (train.getTrackType().toString().equals(trackType.toString())) {
                    totalTrains++;
                }
            }
        }
        return totalTrains;
    }

    // 9. availableTracks (type: TrackType): int -> returns the number of tracks of
    // the specified type available for a given train using that track type to
    // arrive at i.e., total tracks – number of trains at the station with same
    // track type [2 marks]
    public int availableTracks(TrackTypes[] trackTypes) {
        return getTracks(trackTypes) - atStation(trackTypes);
    }

    // 10. canArrive (obOther: Train): boolean -> returns true if the train from
    // parameter can be added to the array list for this station. [Note the train
    // can be allowed considering the parameters of available tracks and the
    // altitude] [4 marks]
    public boolean canArrive(Train obOther) {
        if (obOther.getAltitude() <= this.altitude && availableTracks(obOther.getTrackType()) > 0) {
            return true;
        } else {
            return false;
        }
    }

    // 11. depart (obOther: Train): boolean -> returns true after removing the train
    // specified in parameter from the array list of the station. If the train does
    // not exist in the list, then this method returns false [2 marks]
    public boolean depart(Train obOther) {
        if (trainList.contains(obOther)) {
            trainList.remove(obOther);
            return true;
        } else {
            return false;
        }
    }

    // 12. Create a getter for the array list [1 mark]
    public ArrayList<Train> getTrainList() {
        return trainList;
    }

    // 13. Override the toString () to return the station nme, altitude, number of
    // shared tracks, number of high speed tracks and the altitude of the station.
    // [2 marks]
    @Override
    public String toString() {
        return "Station [altitude=" + altitude + ", name=" + name + ", totalHighSpeed=" + totalHighSpeed
                + ", totalSharedTracks=" + totalSharedTracks + "]";
    }
}