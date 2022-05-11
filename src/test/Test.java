package test;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vocabulary",
                "root",
                "Imskynesser100");

        Statement statement = connection.createStatement();
        String sql = "SELECT * from words";

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println(resultSet.getString("word"));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}

