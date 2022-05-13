package database;

import javafx.util.Pair;

import java.sql.*;
import java.util.ArrayList;

import static database.InitDB.*;

public class Crud {
    static Connection connection;
    static Statement statement;

    static void startServer(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/"+dbname,
                    user,
                    password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void closeServer(){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createUsersTable(){
        startServer();

        String sql = "CREATE TABLE IF NOT EXISTS `users`(" +
                "   `user` VARCHAR(40) NOT NULL," +
                "   `password` VARCHAR(40) NOT NULL," +
                "   PRIMARY KEY ( `user` )" +
                ")ENGINE=InnoDB DEFAULT CHARSET=utf8;";

        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        closeServer();

    }

    public static void createSongListsTable(){
        startServer();

        String sql = "CREATE TABLE IF NOT EXISTS `songlists`(" +
                "   `user` VARCHAR(40) NOT NULL," +
                "   `song` VARCHAR(40) NOT NULL," +
                "   PRIMARY KEY ( `song` )" +
                ")ENGINE=InnoDB DEFAULT CHARSET=utf8;";

        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        closeServer();
    }

    public static ArrayList<Pair<String,String>> selectUser(){
        startServer();
        ArrayList<Pair<String,String>> arrayList = new ArrayList<>();

        String sql = "SELECT * from users;";

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while(true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                Pair<String,String> pair = new Pair<>(resultSet.getString("user"),
                        resultSet.getString("password"));
                arrayList.add(pair);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeServer();

        return arrayList;
    }

    public static ArrayList<Pair<String,String>> selectSongLists(){
        startServer();
        ArrayList<Pair<String,String>> arrayList = new ArrayList<>();

        String sql = "SELECT * from songlists;";

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while(true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                Pair<String,String> pair = new Pair<>(resultSet.getString("user"),
                        resultSet.getString("song"));
                arrayList.add(pair);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeServer();

        return arrayList;
    }



    public static void deleteUser(String user){
        startServer();
        String sql = "DELETE FROM users WHERE user = \""+user+"\"";
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeServer();
    }

    public static void createUser(String user,String password){
        startServer();
        String sql = "INSERT INTO users (user,password)" +
                " VALUES (\""+user+"\",\""+password+"\");";
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeServer();
    }




}
