package Interpreter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {


        // read YAML file and convert it to a string

        Path path = Path.of("example.yaml");
        
        String yaml = Files.readString(path);

        // create a new instance of the tokenizer
        for(String line : yaml.split("\n")){
            System.out.println(line);
        }
    }
       
}
