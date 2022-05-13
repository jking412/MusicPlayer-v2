package pkg;

import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class YamlReader {
    public static Map<String,String> map;
    Yaml yml;
    FileReader reader;
    BufferedReader buffer;



    public void initYamlReader()  {
        yml = new Yaml();
        try {
            reader = new FileReader("config.yaml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        buffer = new BufferedReader(reader);
        map = (Map<String, String>) yml.load(buffer);
    }

    public void closeYamlReader()  {
        try {
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key){
        return map.get(key);
    }
}
