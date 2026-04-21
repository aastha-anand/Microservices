package com.SpringCloud.StudentService.Controller;

import com.SpringCloud.StudentService.Request.StudentRequest;
import com.SpringCloud.StudentService.Response.StudentResponse;
import com.SpringCloud.StudentService.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public StudentResponse createStudent (@RequestBody StudentRequest studentRequest) {
		return studentService.createStudent(studentRequest);
	}
	
	@GetMapping("/getById/{id}")
	public StudentResponse getById (@PathVariable long id) {
		return studentService.getById(id);
	}
	
}
