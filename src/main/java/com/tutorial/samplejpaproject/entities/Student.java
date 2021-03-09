package com.tutorial.samplejpaproject.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Entity
@Table (name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Getter
    @Setter
    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstname;

    @Getter
    @Setter
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastname;

    @Getter
    @Setter
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Getter
    @Setter
    @Column(name = "age", nullable = false)
    private int age;
    
    @Getter
    @Setter
    @Column(name = "date_created", nullable = false, columnDefinition = "DATE")
    private String dateCreated;
    
    @Getter
    @Setter
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
