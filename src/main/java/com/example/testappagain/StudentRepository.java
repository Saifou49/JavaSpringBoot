package com.example.testappagain;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Id>
{


    Object findByEmail(String email);
}
