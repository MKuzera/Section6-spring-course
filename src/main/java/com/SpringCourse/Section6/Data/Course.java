package com.SpringCourse.Section6.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name="Course")
public class Course {
    @Id
    int id;
    @Column(name="name")
    String name;
    @Column(name="author")
    String author;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Course() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
