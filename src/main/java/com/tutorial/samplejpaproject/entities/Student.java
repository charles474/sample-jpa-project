package com.tutorial.samplejpaproject.entities;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstname;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastname;

    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "date_created", nullable = false, columnDefinition = "DATE")
    private String dateCreated;

    @Column(name = "date_updated", nullable = false, columnDefinition = "DATE")
    private String dateUpdated;

    public Student(String firstname, String lastname, String email, int age, String dateCreated, String dateUpdated) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
