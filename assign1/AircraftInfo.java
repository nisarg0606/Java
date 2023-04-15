package assign1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class AircraftInfo {
    public static ArrayList<Aircraft> loadInfo(String sFileName) {
        ArrayList<Aircraft> aircraftList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(sFileName))) {
            String line;
            // ignore the first line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                aircraftList.add(new Aircraft(info));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aircraftList;
    }

    public static void writeAircraftObjects(ArrayList<Aircraft> obList, String sFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(sFile))) {
            for (Aircraft aircraft : obList) {
                oos.writeObject(aircraft);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRAFAircraft(ArrayList<Aircraft> obList, String sFileName) throws IOException {
        final int NAME_SIZE = 50; 
        // final int YEAR_SIZE = 4; 

        try (RandomAccessFile raf = new RandomAccessFile(sFileName, "rw")) {
            for (Aircraft aircraft : obList) {
                String name = aircraft.getName();
                int year = aircraft.getYear();
                String country = aircraft.getCountry();

                name = String.format("%-" + NAME_SIZE + "s", name);

                raf.writeUTF(name);
                raf.writeInt(year);
                raf.writeUTF(country);
            }
        }
    }

    public static Aircraft getRAFRec(String sFile, int nPosition) throws IOException {
        final int NAME_SIZE = 50;
        final int YEAR_SIZE = 4;

        try (RandomAccessFile raf = new RandomAccessFile(sFile, "r")) {
            int recordSize = NAME_SIZE + YEAR_SIZE + 2 * 4;

            if (nPosition * recordSize >= raf.length()) {
                return null;
            }

            raf.seek(nPosition * recordSize);

            String name = raf.readUTF();
            int year = raf.readInt();
            String country = raf.readUTF();

            return new Aircraft(name.trim(), year, country);
        }
    }

    public static void main(String[] args) {
        ArrayList<Aircraft> aircraftList = loadInfo("Aircraft.csv");
        writeAircraftObjects(aircraftList, "aircraft.dat");
        try {
            writeRAFAircraft(aircraftList, "aircraft.raf");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Aircraft aircraft = getRAFRec("aircraft.raf", 0);
            System.out.println(aircraft.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}