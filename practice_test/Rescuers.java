package practice_test;

/*
 * The starter file consists of an interface named Rescuers. 
 * This interface identifies trains that works for rescue operations in case of 
 * natural/accidental incidents. Make all the above ShifterTrains, GoodsTrain,
 *  CommuteTrains and SuperFastTrains implement this Emergency interface appropriately.
 *  Any train with power more than as required by Resuers interface
 *  can act as a rescuer. The implemented method can return true if the implementing
 *  train can act as a rescuer.
 */
public interface Rescuers {
	public static final int REQ_HORSE = 5000;

	public abstract boolean canCommandeer();

}
