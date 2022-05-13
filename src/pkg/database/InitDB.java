package pkg.database;

import pkg.YamlReader;

import static pkg.database.Crud.createSongListsTable;
import static pkg.database.Crud.createUsersTable;

public class InitDB {
    public static  String port;
    public static  String dbname;
    public static  String user;
    public static  String password;



    public void init()  {
        port = YamlReader.get("port");
        dbname = YamlReader.get("dbname");
        user = YamlReader.get("user");
        password = YamlReader.get("password");
        createUsersTable();
        createSongListsTable();
    }

}
