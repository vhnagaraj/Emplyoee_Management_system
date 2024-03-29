package com.Emp.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Emp.System.Entity.EmpEntity;
import com.Emp.System.Service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String Home(Model model)
	{
		List<EmpEntity> getAllEmp = service.GetAllEmp();
		model.addAttribute("getAllEmp",getAllEmp);
		return "index";
	}
	
	@GetMapping("/addEmp")
	public String AddEmp()
	{
		return "addEmp";
	}
	
	@PostMapping("/submit")
	public String EmpHandler(@ModelAttribute EmpEntity empEntity, HttpSession session)
	{
		System.out.println(empEntity);
		service.Save(empEntity);
		session.setAttribute("message", "Employee Successfully Added");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String Edit(@PathVariable int id,Model m)
	{
		EmpEntity get = service.Get(id);
		m.addAttribute("get", get);
		return "edit";
	}
	
	@PostMapping("/update")
	public String Update(@ModelAttribute EmpEntity e, HttpSession session)
	{
		service.Save(e);
		session.setAttribute("message", "Updated Successfully");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String Delete(@PathVariable int id, HttpSession session)
	{
		service.DeleteEmp(id);
		session.setAttribute("message", "Deleted Successfully");
		return "redirect:/";
	}

}
