package parser;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Yaml yaml = new Yaml(new Constructor(Map.class));
        InputStream inputStream = Main.class
                .getClassLoader()
                .getResourceAsStream("tokenizer.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        tokenizeYaml(obj);
    }

    public static void tokenizeYaml(Map<String, Object> yamlMap) {
        for (Map.Entry<String, Object> entry : yamlMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (entry.getValue() instanceof Map) {
                tokenizeYaml((Map<String, Object>) entry.getValue());
            }
        }
    }
}