package com.example.techacademy.controller;

import com.example.techacademy.model.Course;
import com.example.techacademy.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController
{
    @Autowired
    private CourseService CourseService;

@GetMapping(value="/all")
    public List<Course> getAll() {
    return this.CourseService.getallCourse();
}
@PostMapping(value = "/add")
public String addNewCourse(@RequestBody Course course)
{
    return this.CourseService.addCourse(course);
}
@PutMapping(value = "/update/{courseId}")
public  void updateCourse(@PathVariable Integer courseId ,@RequestBody Course course)
{
    this.CourseService.updateCourse(courseId,course);
}
@DeleteMapping(value="/delete{courseId}")
public String deleteCourse(@PathVariable Integer courseId)
{
    return this.CourseService.deleteCourse(courseId);
}
}
