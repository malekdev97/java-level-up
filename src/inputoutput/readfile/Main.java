package readfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) throws IOException {


        String fileName = "example.txt";
        String content = "Java is the best language";
        // Easy beasy lemon squzzy
        createFile(fileName, content);
        outputFile(fileName);
    }

    public static void createFile(String fileName, String fileContent) throws IOException {

        // [Input_String] -> [bytes] -> [file] -> [bytes] -> [Ouput_String] 

        FileOutputStream fos = new FileOutputStream(fileName, true);
        fos.write(fileContent.getBytes()); 
        fos.write("\nNew line new beggining!".getBytes());
        fos.close();
    }

    public static void outputFile(String filePath) throws IOException {
        int counter = 0;
        for (String line : Files.readAllLines(Path.of("example.txt"))) {
            System.out.print(line);
            System.out.println(" "+ ++counter);
        }
    }
}
