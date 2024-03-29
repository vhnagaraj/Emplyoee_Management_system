package com.Emp.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emp.System.Entity.EmpEntity;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Integer>{
	
	

}
