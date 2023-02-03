package assign1;

import java.io.File;

/*
 Write a program Backup.java that when given command line arguments that correspond to directories, will go through and 
1.	Make a directory called “Backups” under that directory (if it does not already exist).
2.	Copy all files with a ‘.txt’  or ‘.java’ suffix in that directory to that backup directory.

So if the given command line arguments are C:/Info and C:/Results the program will make Backup directories (called “Backups”) under those two directories and copy all the text and Java Files into that directory.
If the backup dir already existed, delete it.

Note if the specified directory path does not exist, just ignore that argument and move on to the next command line argument.
 */
public class Backup {
    public static void main(String[] args) {
        // make sure there is at least one command line argument
        if (args.length == 0) {
            System.out.println("No command line argument provided.");
            System.exit(1);
        }
        // get directory path from command line argument
        String dirPath = args[0];
        // create a File object
        File dir = new File(dirPath);
        // check if the directory exists
        if (!dir.exists()) {
            System.out.println("Directory does not exist.");
            System.exit(2);
        }
        // create a File object for the backup directory
        File backupDir = new File(dirPath + "/Backups");
        // check if the backup directory exists
        if (backupDir.exists()) {
            // delete the backup directory
            backupDir.delete();
        }
        // create the backup directory
        backupDir.mkdir();
        // get all files in the directory
        File[] files = dir.listFiles();
        // iterate through all files
        for (File file : files) {
            // check if the file is a text file or a Java file
            if (file.getName().endsWith(".txt") || file.getName().endsWith(".java")) {
                // copy the file to the backup directory
                file.renameTo(new File(backupDir + "/" + file.getName()));
            }
        }
    }
}
