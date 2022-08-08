package com.example.student.Repository;

import com.example.student.Model.Student;

import java.util.List;

public interface StudentRepository {
    List<Students> findAll() ;
    Students add(Students s);
    String deleteById(Long id) ;
    Students updateNameById(Long id , String newName);
    List<Students> findWhereNameLike(String query) ;
}

