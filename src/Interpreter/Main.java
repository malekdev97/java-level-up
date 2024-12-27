package Interpreter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {


        // read YAML file and convert it to a string

        Path path = Path.of("example.yaml");
        
        String yaml = Files.readString(path);

        ArrayList<String> tokens = new ArrayList<String>();

        // create a new instance of the tokenizer
        for(String line : yaml.split("\n")){
            for(String letter : line.split("")){
                
                tokens.add(letter);
  
            }
        }

        System.out.println(tokens);
    }
       
}
