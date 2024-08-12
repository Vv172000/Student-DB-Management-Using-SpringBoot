package com.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Model.Student;
@Repository
public interface StudentRepo extends  JpaRepository<Student, Long>  {

}
