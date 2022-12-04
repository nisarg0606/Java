package practice_test;

import java.util.ArrayList;

public class TrainStationTest
{

	/**
	 * @param lstStations
	 * @param TrackTypes
	 * @return count of tracks of specified type at the given stations in the list
	 */
    // 1. countTracks (ArrayList<TrainStation> lstStations, RailType eRailType):
    // int -> this method should return a count of tracks of the specified type at
    // given stations [2 marks]
	public int countTracks(ArrayList<Station> lstStations, TrackTypes TrackTypes)
	{
        int totalTracks = 0;
        for (Station station : lstStations) {
            totalTracks += station.getTracks(new TrackTypes[] { TrackTypes });
        }
        return totalTracks;
	}


	/**
	 * @param lstStations
	 * @param eTrackTypes
	 * @return list of trains that uses the specified track type and are currently at any of the station from the list
	 */
    // 2. getTrains (ArrayList<TrainStation> lstStations, RailType eRailType):
    // ArrayList<Train> -> this method returns a list of trains that uses the
    // specified track type and are currently at any of the station [4 marks]
	public ArrayList<Train> getTrains(ArrayList<Station> lstStations, TrackTypes eTrackTypes)
	{
        ArrayList<Train> trains = new ArrayList<Train>();
        for (Station station : lstStations) {
            for (Train train : station.getTrainList()) {
                if (train.getTrackType().toString().equals(eTrackTypes.toString())) {
                    trains.add(train);
                }
            }
        }
        return trains;
	}


	/**
	 * @param obStation
	 * @return list of trains that be used for rescue purpose from the given station.
	 * The list of trains is sorted in descending order of the power of the train that fits the requirement
	 */
    // 3. disasterResponse(TrainStation obStation): ArrayList<Train> -> this method
    // returns a list of trains that be used for rescue purpose from the given
    // station. Sort the list in descending order of the power of matching trains [4
    // marks]
	public ArrayList<Train> disasterResponse(Station obStation)
	{
        ArrayList<Train> trains = new ArrayList<Train>();
        for (Train train : obStation.getTrainList()) {
            if(train instanceof Rescuers) {
                if (((Rescuers) train).canCommandeer()) {
                    trains.add(train);
                }
            }
        }
        trains.sort((t1, t2) -> t2.getPower() - t1.getPower());
        return trains;
	}

    public static void main(String[] args) {
        TrainStationTest test = new TrainStationTest();
        ArrayList<Station> stations = new ArrayList<Station>();
        stations.add(new Station("Station 1", 5, 2, 50));
        stations.add(new Station("Station 2", 10, 3, 100));
        stations.add(new Station("Station 3", 15, 4, 150));
        stations.add(new Station("Station 4", 20, 5, 200));
        
        System.out.println("Total tracks: " + test.countTracks(stations, TrackTypes.SharedUse));
    }
}