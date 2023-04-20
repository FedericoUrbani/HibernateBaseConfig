package com.develhope.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Classes classes;

    public Enrollments(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
