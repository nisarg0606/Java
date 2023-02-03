package assign1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line argument provided.");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            System.exit(2);
        }
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String dir = file.getParent();
            System.out.println(dir);
            String fileName = file.getName();
            System.out.println(fileName);
            File newFile = new File(dir + "/REV" + fileName);
            bw = new BufferedWriter(new FileWriter(newFile));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    words[i] = new StringBuilder(words[i]).reverse().toString();
                    System.out.println(words[i]);
                    bw.write(words[i] + " ");
                }
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
