package com.example.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;
    @ManyToMany(mappedBy = "students")
    private Set<Subject> subjects= new HashSet<>();
}
