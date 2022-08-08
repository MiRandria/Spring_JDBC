package com.example.student.Repository;

import com.example.student.Model.Group;
import com.example.student.Model.Student;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List

public class StudentRepositoryJDBC extends Connection implements  StudentRepository {


    @Override
    public List<Students> findAll() {
        Statement stmt = Connection.getStatement();
        ResultSet rs;
        List<Student> student = new ArrayList<>() ;
        try  {
            rs = stmt.executeQuery("SELECT * FROM student");

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    @Override
    public Students add(Student s) {
        Statement stmt = connection.getStatement();
        try{
            String  = "INSERT INTO student VALUES ("+s.getName()+","+s.getId()+","+s.getGroups().getId()+");";
            stmt.executeUpdate(choix);
            System.out.println("Insert succesfully");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Insert failed");
        }
        return null;
    }

    @Override
    public String deleteById(Long id) {
        Statement stmt = connection.getStatement();
        try {
            groupsRepo.deleteById(id);
            stmt.executeUpdate("DELETE FROM student WHERE students.id="+id+";");
            System.out.println("Delete succesfully");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Students updateNameById() {

    }

    @Override
    public List<Students> findWhereNameLike() {

    }
}
