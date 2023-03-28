package org.example;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;

public class DataBase {
    static int id = 0;
    static String userName = "root";
    static String password = "1234";
    static String connectionUrl = "jdbc:mysql://localhost:3306/equation";

    static void DB() {

        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
            Statement statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void addEq(String eq) {
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement() ) {

            statement.executeUpdate("INSERT INTO equation (trueEq) values ('" + eq + "')");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void addRoot(String root){
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);){
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM equation");
             resultSet.last();
             resultSet.updateString("trueRoot", root);
             resultSet.updateRow();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void searchByRoot (String search){
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement() ) {
             ResultSet resultSet = statement.executeQuery("SELECT * FROM equation WHERE trueRoot = '"+ search +"'");
             while (resultSet.next()){
                 System.out.println(resultSet.getString("trueEq")  +  " "  +  resultSet.getString("trueRoot"));
             }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}