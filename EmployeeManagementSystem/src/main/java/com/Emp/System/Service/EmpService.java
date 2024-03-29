package com.Emp.System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emp.System.Entity.EmpEntity;
import com.Emp.System.Repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public void Save(EmpEntity emp)
	{
		EmpEntity save = repo.save(emp);
	}
	
	public List<EmpEntity> GetAllEmp()
	{
		 return repo.findAll();
	}
	
	public EmpEntity Get(int id)
	{
		Optional<EmpEntity> findById = repo.findById(id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}
	
	public void DeleteEmp(int id)
	{
		repo.deleteById(id);
	}

}
