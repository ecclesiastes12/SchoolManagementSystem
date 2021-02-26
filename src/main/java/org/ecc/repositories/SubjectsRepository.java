package org.ecc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.ecc.entities.Subject;

public interface SubjectsRepository extends JpaRepository<Subject, Long> {

	
}
