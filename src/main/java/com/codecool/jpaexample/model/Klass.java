package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Class")
public class Klass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CCLocation ccLocation;

    @OneToMany
    private Set<Student> students = new HashSet<>();

    public Klass() {}

    public Klass(String name, CCLocation ccLocation) {
        this.name = name;
        this.ccLocation = ccLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
