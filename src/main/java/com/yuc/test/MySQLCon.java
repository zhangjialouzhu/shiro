package com.yuc.test;

import java.net.ConnectException;
import java.sql.*;

public class MySQLCon {
    private static Statement statement;
    private static Connection connection;
    public static Connection getCon(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_conline?useUnicode=true&amp;characterEncoding=utf-8","root","");
            statement = connection.createStatement();
            ResultSet set = statement.executeQuery("select * from t_doc ");

        }catch (ClassNotFoundException e){
            connection = null;
            e.printStackTrace();
        }catch (SQLException e){
            connection = null;
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        MySQLCon.getCon();
    }
}
