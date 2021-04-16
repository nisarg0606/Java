package IODemo;
import java.io.*;
public class TestObjectInputStreamTransient {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("sturcd.txt");
                ObjectInputStream oin = new ObjectInputStream(fin);) {
            Student sobj[] = (Student[]) oin.readObject();

            for (int i = 0; i < sobj.length; i++) {
                System.out.println(sobj[i].getRno() + " " + sobj[i].getName() + " " + sobj[i].getstd());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}