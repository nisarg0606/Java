package USA_Practice;

import java.io.File;
import java.io.IOException;

public class Files_Demo {
    // how many modes were there in Files?
    // r w a r+ w+ a+
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println("File is created...");
        } else {
            System.out.println("File Already exists...");
        }
        System.out.println(file.getAbsolutePath());
        File f = new File("D:/Java/USA_Practice");
        File[] filenames = f.listFiles();
        for (File files : filenames) {
            System.out.println(files.getName() + " Can Write: " + files.canWrite() +
                    " Hidden: " + files.isHidden() + " Length: " + files.length() + "bytes");
        }
    }

}
