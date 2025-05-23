package lk.ac.vau.fas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.model.Course;

@RestController
@RequestMapping("course")
public class CourseController {
	
	private Map<String, Course> mcourse = new HashMap<String, Course>();
	
	@GetMapping("/create")
	public String addCourse(@RequestBody Course course) {
		try {
			mcourse.put(course.getCode(), course);
			return "Course created succesfully";
		} catch(Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable("id") String code) {
		try {
			if(mcourse.get(code) != null) {
				mcourse.remove(code);
				return "Course deleted succesfully";
			}
			return "404 Couldn't found a course with that code";
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	
	

}