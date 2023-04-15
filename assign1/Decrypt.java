package assign1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decrypt {
    public static String decryptLine(String sEncryptedLine, String sKeypad) {
        char[] encryptedText = sEncryptedLine.toCharArray();
        for (int i = 0; i < encryptedText.length; i++) {
            int index = "abcdefghijklmnopqrstuvwxyz".indexOf(encryptedText[i]);
            if (index != -1) {
                encryptedText[i] = sKeypad.charAt(index);
            }
        }
        return new String(encryptedText);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: missing file arguments.");
            System.exit(1);
        }
        String encryptedFileName = args[0];
        File encryptedFile = new File(encryptedFileName);
        if (!encryptedFile.exists()) {
            System.out.println("Error: Encrypted file not found");
            System.exit(1);
        }

        String keypadFileName = args[1];
        File KeyPadFile = new File(keypadFileName);
        if (!KeyPadFile.exists()) {
            System.out.println("Error: Keypad file not found");
            System.exit(1);
        }
        try {
            Scanner keypadInput = new Scanner(KeyPadFile);
            String keypad = keypadInput.nextLine();
            keypadInput.close();

            Scanner encFile = new Scanner(encryptedFile);
            PrintWriter decrypt = new PrintWriter(encryptedFileName + "_Dec.txt");
            while (encFile.hasNextLine()) {
                decrypt.println(decryptLine(encFile.nextLine(), keypad));
            }
            encFile.close();
            decrypt.close();

            System.out.println("File Decrypted Successfully....");
        } catch (Exception e) {
            System.out.println("Error -- File not found");
            System.exit(1);
        }
    }
}