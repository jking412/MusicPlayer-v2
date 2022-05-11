package test;


import org.yaml.snakeyaml.Yaml;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Yaml yml = new Yaml();
        FileReader reader = new FileReader("config.yaml");
        BufferedReader buffer = new BufferedReader(reader);
        Map<String,Object> map = (Map<String, Object>) yml.load(buffer);
        System.out.println(map.get("password"));
        System.out.println(map.get("root"));
        buffer.close();
        reader.close();
    }
}
