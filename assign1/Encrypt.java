package assign1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Encrypt {
    public static String genKeyPad() {
        char[] keypad = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        // a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8, j = 9, k = 10,
        // l = 11, m = 12, n = 13, o = 14, p = 15, q = 16, r = 17, s = 18, t = 19, u =
        // 20, v = 21, w = 22, x = 23, y = 24, z = 25
        for (int i = 0; i < keypad.length; i++) {
            int randomIndex = random.nextInt(keypad.length - i) + i;
            char temp = keypad[i];
            keypad[i] = keypad[randomIndex];
            keypad[randomIndex] = temp;
        }
        String output = new String(keypad);
        return output;
    }

    // wlvxzkqurbshdaicgpjmftoeny
    // w = 0, l = 1, v = 2, x = 3, z = 4, k = 5, q = 6, u = 7, r = 8, b = 9, s = 10,
    // h = 11, d = 12, a = 13, i = 14, c = 15, g = 16, p = 17, j = 18, m = 19, f =
    // 20, t = 21, o = 22, e = 23, n = 24, y = 25
    // a,a,r,s,h
    public static String encryptLine(String sPlainText, String sKeypad) {
        char[] plainText = sPlainText.toLowerCase().toCharArray();
        for (int i = 0; i < plainText.length; i++) {
            int index = sKeypad.indexOf(plainText[i]);
            if (index != -1) {
                plainText[i] = "abcdefghijklmnopqrstuvwxyz".charAt(index);
            }
        }
        return new String(plainText);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: missing file arguments.");
        }
        String fileName = args[0];
        if (!fileName.endsWith(".txt")) {
            System.out.println("Error: invalid file format");
            System.exit(1);
        }
        File file = new File(fileName);
        String keypad = genKeyPad();
        try (Scanner sc = new Scanner(file)) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "_encF.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String encryptedLine = encryptLine(line, keypad);
                writer.write(encryptedLine);
                writer.newLine();
            }
            sc.close();
            writer.close();

            PrintWriter keyPadFile = new PrintWriter("filename" + "_enc.txt");
            keyPadFile.println(keypad);
            keyPadFile.close();

            System.out.println("File Successfully Encrypted....");
        } catch (Exception e) {
            System.out.println("Error --> File not Found");
            System.exit(1);
        }
    }
}
