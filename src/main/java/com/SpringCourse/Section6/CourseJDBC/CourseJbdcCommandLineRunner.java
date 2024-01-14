package com.SpringCourse.Section6.CourseJDBC;

import com.SpringCourse.Section6.Data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJbdcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course(2,"spring lol","Nie ja");
        Course course2 = new Course(3,"spring lol2","Nie ja2");
        Course course3 = new Course(4,"spring lol3","Nie ja3");

        repository.insert(course1);
        repository.insert(course2);
        repository.insert(course3);

        repository.delete(course2);
        Course course = repository.selectById(4);
        System.out.println(course.toString() + " from jbdc string");
    }
}
