package finalExam;

import java.util.ArrayList;

public class Q5 {
	// 1. The method countAbove will be given an ArrayList of AirPort objects and an
	// altitude. It should return the number of airports that are above this
	// altitude.
	public static int countAbove(ArrayList<AirPort> obList, int nAltitude) {
		ArrayList<AirPort> obAbove = new ArrayList<AirPort>();
		for (AirPort obPort : obList) {
			if (obPort.getAltitude() > nAltitude) {
				obAbove.add(obPort);
			}
		}
		return obAbove.size();
	}

	// 2. The method findPlane will be given an ArrayList of ComAircraft and a
	// search ComAircraft object (Just an empty object with the registration Number
	// filled in). This method should return a reference to ComAircraft with the
	// corresponding serial number or null if no such plane exists.
	public static ComAircraft findPlane(ArrayList<ComAircraft> obList, ComAircraft obSearchCraft) {
		for (ComAircraft obCraft : obList) {
			if (obCraft.reg.equals(obSearchCraft.reg)) {
				return obCraft;
			}
		}
		return null;
	}

	// 3. The method getSTOL is given an ArrayList of ComAircraft. It should return
	// an Array of ComAircraft that are STOL capable.
	// STOL = Short Take Off and Landing
	public static ComAircraft[] getSTOL(ArrayList<ComAircraft> obList) {
		ArrayList<ComAircraft> obSTOL = new ArrayList<ComAircraft>();
		for (ComAircraft obCraft : obList) {
			if (obCraft.getToLength() < 3000) {
				obSTOL.add(obCraft);
			}
		}
		ComAircraft[] obSTOLArray = new ComAircraft[obSTOL.size()];
		obSTOLArray = obSTOL.toArray(obSTOLArray);
		return obSTOLArray;
	}

	// 4. The method testCases should return an ArrayList of 5 different sample
	// ComAircraft that can be used for testing purposes.
	public static ArrayList<ComAircraft> testCases() {
		ArrayList<ComAircraft> obTestCases = new ArrayList<ComAircraft>();
		obTestCases.add(new TurboJet("N12345", 3, 200, true));
		obTestCases.add(new TurboProp("N12346", 3, 200, true));
		obTestCases.add(new TurboJet("N12347", 3, 200, true));
		obTestCases.add(new TurboProp("N12348", 3, 200, true));
		obTestCases.add(new Helicopter("H1234", 3, 200, false, false));
		return obTestCases;
	}

	// 5. The gatherOrphans methods will be given an ArrayList of aircraft and an
	// ArrayList of airports. This method shall return a list of all aircraft that
	// cannot land at any of the airports for any reason
	public static ArrayList<ComAircraft> gatherOrphans(ArrayList<ComAircraft> obCraftList,
			ArrayList<AirPort> obPortList) {
		ArrayList<ComAircraft> obOrphans = new ArrayList<ComAircraft>();
		for (ComAircraft obCraft : obCraftList) {
			boolean bCanLand = false;
			for (AirPort obPort : obPortList) {
				if (obPort.canLand(obCraft)) {
					bCanLand = true;
				}
			}
			if (!bCanLand) {
				obOrphans.add(obCraft);
			}
		}
		return obOrphans;
	}
}
