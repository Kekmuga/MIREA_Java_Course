package Pract_21;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        listAndPrintFilesInDirectory("C:\\Users\\Kelman\\IdeaProjects\\Lol");
    }

    public static void listAndPrintFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null && files.length > 0) {
                System.out.println("File catalog:");
                int count = 0;

                for (File file : files) {
                    if (count < 5) {
                        System.out.println(file.getName());
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("Empty");
            }
        } else {
            System.out.println("Non exist");
        }
    }
}