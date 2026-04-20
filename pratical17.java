import java.io.*;
import java.util.*;

class pratical17 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileOperations copy source.txt dest.txt");
            System.out.println("Delete: java FileOperations delete filename.txt");
            System.out.println("Rename: java FileOperations rename oldname.txt newname.txt");
            return;
        }

        String command = args[0];

        try {
            switch (command.toLowerCase()) {

                case "copy":
                    if (args.length != 3) return;
                    copyFile(args[1], args[2]);
                    printFileProperties(new File(args[2]));
                    break;

                case "delete":
                    File fileToDelete = new File(args[1]);
                    if (fileToDelete.delete())
                        System.out.println("File deleted successfully.");
                    else
                        System.out.println("Failed to delete file.");
                    break;

                case "rename":
                    if (args.length != 3) return;
                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        printFileProperties(newFile);
                    } else {
                        System.out.println("Rename failed.");
                    }
                    break;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    static void copyFile(String source, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dest);

        int ch;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }

    static void printFileProperties(File file) {
        System.out.println("\n--- File Properties ---");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }
}