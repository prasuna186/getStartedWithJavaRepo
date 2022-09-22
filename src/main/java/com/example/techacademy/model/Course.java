package com.example.techacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course
{
    @Id
    private Integer courseid;
    private String coursename;
    private int courseduration;
    private int coursefeese;



}
