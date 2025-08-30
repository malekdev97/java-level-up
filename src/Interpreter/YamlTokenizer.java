package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class YamlTokenizer {

    public static List<String[]> tokenize(String yamlContent) {
        List<String[]> tokens = new ArrayList<>();
        String[] lines = yamlContent.split("\\r?\\n");

        for (String line : lines) {
            line = line.trim();

            String[] token = new String[3]; // {type, key, value}

            if (line.contains(":")) {
                // Key-value pair
                String[] parts = line.split(":", 2);
                token[0] = "key-value";
                token[1] = parts[0].trim(); // Key
                token[2] = parts.length > 1 ? parts[1].trim() : null; // Value (if exists)
            } 

            tokens.add(token);
        }
        return tokens;
    }

    public static void main(String[] args) {
        String yamlContent = "name: Project\nversion: 1";

        List<String[]> tokens = tokenize(yamlContent);

        // Parsed Structure AST (Abstract Syntax Tree)
        /**
         * @OUTPUT
         * Type: key-value, Key: name, Value: Project
         * Type: key-value, Key: version, Value: 1
         */
        for (String[] token : tokens) {
            System.out.println("Type: " + token[0] + ", Key: " + token[1] + ", Value: " + token[2]);
        }
    }
}
