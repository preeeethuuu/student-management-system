package com.sjprogramming.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
