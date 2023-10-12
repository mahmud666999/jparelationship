package com.example.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Subject {
    @Id
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "StudentsEnrolled",
            joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id")
    )
    private Set<Student> students= new HashSet<>();

}
