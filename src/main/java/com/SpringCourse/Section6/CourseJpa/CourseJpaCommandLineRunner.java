package com.SpringCourse.Section6.CourseJpa;


import com.SpringCourse.Section6.Data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course(5,"spring lol5","Nie ja5");
        Course course2 = new Course(6,"spring lol6","Nie ja6");
        Course course3 = new Course(7,"spring lol7","Nie ja7");

        courseJpaRepository.insert(course1);
        courseJpaRepository.insert(course2);
        courseJpaRepository.insert(course3);

        Course byId = courseJpaRepository.findById(6);
        System.out.println(byId.toString() + " from JPA");

        courseJpaRepository.deleteById(7);
//        repository.insert(course1);
//        repository.insert(course2);
//        repository.insert(course3);
//
//        repository.delete(course2);
//        Course course = repository.selectById(4);
//        System.out.println(course.toString());
    }
}
