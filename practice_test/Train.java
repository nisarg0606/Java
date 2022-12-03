package practice_test;

import java.util.Comparator;

/*
 * Class name: Train
Attributes:
1.	+ power: int 	-> represents the horsepower of the train [1 mark]
2.	- name: String 	-> the name to identify the train [1 mark]
3.	# code: String 	-> the train number/code [1 mark]
Methods:
1.	+ Train (name: String, power: int) [1 mark]
2.	Getters for all 3 attributes [3 marks]
3.	Setters for all 3 attributes [3 marks]
4.	getTrackType (): TrackType[] 	-> this abstract method returns the type of tracks the train runs on [Note that this method returns an array of TrackType]  [1 mark]
5.	getEngineType (): EngineType 	-> this abstract method returns the type of engine associated with the train [Note that this method returns the value from the EngineType enumeration] [1 mark]
6.	getWagonCapacity (): int 	-> this abstract method returns the number of wagons that the train can pull [1 mark]
7.	canRunOn (type: TrackType): boolean 	-> this method returns true/false depending on whether that train can run on the given track type. [2 mark]
8.	equals (obOther: Object): boolean 	-> this method returns true if the object is any Train and also has the same train code [2 mark]
9.	toString (): String 			-> this method returns the Train details like the name, code, power, wagon capacity and the engine type [1 mark]

 */
public abstract class Train implements Comparable<Train>{
    int power;
    String name;
    String code;

    public Train(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract TrackTypes[] getTrackType();

    public abstract EngineType getEngineType();

    public abstract int getWagonCapacity();

    public boolean canRunOn(TrackTypes type) {
        return false;
    }

    public boolean equals(Object obOther) {
        if (obOther instanceof Train && getCode().equals(((Train) obOther).getCode())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "power=" + power + ", name='" + name + '\'' + ", code='" + code + '\'' + '}';
    }

    //Modify the Train class to implement the Comparable<Train> interface. 
    // The trains will be compared only on their code.
    @Override
    public int compareTo(Train o) {
        return this.code.compareTo(o.code);
    }

    /*
     * Provide an appropriate implementation 
     * of Comparator interface to compare two trains on basis of the power that they use to move
     */

    public static Comparator<Train> powerComparator = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.power - o2.power;
        }
    };

    public int getAltitude() {
        return 0;
    }
}
