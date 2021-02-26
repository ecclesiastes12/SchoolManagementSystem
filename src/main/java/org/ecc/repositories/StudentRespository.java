package org.ecc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.ecc.entities.Student;

public interface StudentRespository extends JpaRepository<Student, String> {

}
