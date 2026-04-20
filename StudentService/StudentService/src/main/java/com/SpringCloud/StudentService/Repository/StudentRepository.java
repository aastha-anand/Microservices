package com.SpringCloud.StudentService.Repository;

import com.SpringCloud.StudentService.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	
	
}
