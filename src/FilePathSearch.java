import java.io.File;
import java.util.Scanner;
public class FilePathSearch {
    private void FileFinder() {
        File file = new File("/home/nirupu");
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        do {
            int key = 0;
            System.out.println("Enter name of file or folder : ");

            fileName = keyboard.nextLine();

            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder
            for (String string : files) {
                //Check the name of files present or not and store in boolean variable
                Boolean flag = fileName.equals(string);
                //if flag is true then print the following
                if (flag) {
                    key = 1;
                    System.out.println("File Found: " + string);
                    //Printing the path of the fiel
                    System.out.println("Path: " + file.getAbsolutePath());
                }
            }
            //if file not found
            if (key == 0) {
                System.out.println("File not found, Re-Enter the file name");
            }
        } while (true);
    }

    public static void main(String[] args) {
        FilePathSearch obj = new FilePathSearch();
        obj.FileFinder();
    }
}

