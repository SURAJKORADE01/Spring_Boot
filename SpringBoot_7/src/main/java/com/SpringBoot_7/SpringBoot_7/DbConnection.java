package com.SpringBoot_7.SpringBoot_7;

import java.sql.Connection;
import java.sql.*;

public class DbConnection
{
    public static Connection DbConnect() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String URL = "jdbc:mysql://localhost:3306/springboot";
        String userName = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(URL,userName,password);

        return connection;
    }
}
