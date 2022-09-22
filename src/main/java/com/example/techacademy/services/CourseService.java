package com.example.techacademy.services;

import com.example.techacademy.model.Course;
import com.example.techacademy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CourseService
{
    @Autowired
    private CourseRepository courseRepository;

         // add course

    public String addCourse(Course course)
    {
        this.courseRepository.save(course);
        return "added courses";
    }
    //get all course
    public List<Course> getallCourse()
    {
        return this.courseRepository.findAll();
    }
    //Update course
    public void updateCourse(Integer courseid,Course course)
    {
        this.courseRepository.save(course);
        //for(int i=0;i<this.totalCourse.size();i++)
        //
    }

    //delete Course
    public String deleteCourse(Integer courseid)
    {
        this.courseRepository.deleteById(courseid);
       // this.totalCourse.removeIf(course -> course.getCourseid().equals(courseId));
        return "deleted successfully";
    }
}
