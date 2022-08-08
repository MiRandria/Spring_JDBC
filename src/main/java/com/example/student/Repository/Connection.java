package com.example.student.Repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class Connection {
    public Connection con ;

    public DbConnection() {
        try{
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school", "postgres","minosoa");
            System.out.println("You are connected to the database ");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public Statement getStatement() throws SQLException {
        return (Statement) connex.createStatement();
    }