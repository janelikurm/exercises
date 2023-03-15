import java.io.File;
import java.util.Scanner;

public class DirectoryTree {

    /**
     * - gradlew build
     * - java -cp /home/vali-it/IdeaProjects/exercises/build/libs/exercises-1.0-SNAPSHOT.jar DirectoryTree
     * */
    public static void main(String[] args) {

        /*
         * Write a programs that takes a path and prints expanded directory tree
         *
         * https://en.wikipedia.org/wiki/Tree_%28command%29
         *
         * E.g.
         * $ tree path/to/folder/
         * path/to/folder/
         * ├── a-first.html
         * ├── b-second.html
         * ├── subfolder
         * │   ├── readme.html
         * │   ├── code.cpp
         * │   └── code.h
         * └── z-last-file.html
         *
         * 1 directories, 6 files
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which path would you like to use:");
        String path = scanner.next();
        String[] filesAndDirectories = new File(path).list();
        if (filesAndDirectories == null) {
            System.out.println("Directory not found");
            return;
        }
        System.out.println("Contents of " + path);
        int level = 1;
        printFilesAndDirectories(level, new File(path));
    }

    private static void printFilesAndDirectories(int level, File directory) {
        String indent = "───";
        String space = "   ";
        System.out.println(space.repeat(level) + "|" + indent + directory.getName());
        File[] filesAndDirectories = directory.listFiles();
        for (File filesAndDirectory : filesAndDirectories) {

            if (filesAndDirectory.isDirectory()) {
                printFilesAndDirectories(level + 1, filesAndDirectory);
            } else {
                System.out.println(space.repeat(level + 1) + "|" + indent + filesAndDirectory.getName());

            }
        }
    }
}