package VSITR.Revision;
import java.io.*;
class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("E:\\Java Final\\VSITR\\Revision\\bytestream.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}