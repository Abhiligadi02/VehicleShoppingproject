package com.springboot.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   
//	@GetMapping("/Student")
//	public Student getStudent() {
//		return new Student("SLK","Bangaluru");
//	}
//	@GetMapping("/Students")
//	public List<Student> getStudent1() {
//		 List<Student> students = new ArrayList<>();
//		 
//		students.add(new Student("SLK1","Bangaluru1"));
//		students.add(new Student("SLK2","Bangaluru12"));
//		students.add(new Student("SLK3","Bangaluru13"));
//		students.add(new Student("SLK4","Bangaluru14"));
//		students.add(new Student("SLK5","Bangaluru15"));
//		return students;
//	}
	
	
	@GetMapping("{firstName}/{lastName}/{age}/{accountNumber}")
	public Student studentPathVariable
	(@PathVariable("firstName") String firstName,
	@PathVariable("lastName") String lastName,
	@PathVariable("age") int age,
    @PathVariable("accountNumber") long accountNumber)
	
	{
		return new Student (firstName,lastName,age,accountNumber);
	}
	
	@GetMapping("/student/Query")
	public Student studentQueryparam(@RequestParam(name="firstname") String firstName,
			@RequestParam(name="lastname") String lastName,@RequestParam(name="age") int age,@RequestParam(name="accountNumber") long accountNumber)
	{
		return new Student(firstName, lastName ,age,accountNumber);
	}
	
}

	

