package musicplayer;

import component.InitComponent;
import pkg.database.InitDB;
import pkg.YamlReader;

public class Init {

    public void initServer(){
        YamlReader yamlReader = new YamlReader();
        InitDB initDB = new InitDB();

        yamlReader.initYamlReader();
        initDB.init();
        yamlReader.closeYamlReader();

        InitComponent initComponent = new InitComponent();
        initComponent.init();
    }


}
