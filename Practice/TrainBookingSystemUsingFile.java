package Practice;

import java.io.*;

class Details_train{
    public void insert(){
        try(FileWriter fw = new FileWriter("Timetable.txt", true)) {
            BufferedWriter bin = new BufferedWriter(fw);

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader b1 = new BufferedReader(isr);
            
            System.out.print("Enter Train ID: ");
            String id = b1.readLine();
            System.out.print("Enter Train Name: ");
            String name = b1.readLine();
            System.out.print("Enter Departure Station: ");
            String departure = b1.readLine();
            System.out.print("Enter Arrival Station: ");
            String arrival = b1.readLine();
            System.out.print("Enter Fair:");
            String fair = b1.readLine();
            System.out.println("Enter Departure Time");
            String time = b1.readLine();

            bin.write(id);
            bin.write(' ');
            bin.write(name);
            bin.write(' ');
            bin.write(departure);
            bin.write(' ');
            bin.write(arrival);
            bin.write(' ');
            bin.write(fair);
            bin.write(' ');
            bin.write(time);
            
            bin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // finally{
        //     bin.close();
        // }
    }
    public void search_train() {
        try (FileReader fr = new FileReader("Timetable.txt")){
            
        } catch (Exception e) {
            
        }
    }
}
public class TrainBookingSystemUsingFile {
    public static void main(String[] args) {
        Details_train dt = new Details_train();
        dt.insert();
    }
}