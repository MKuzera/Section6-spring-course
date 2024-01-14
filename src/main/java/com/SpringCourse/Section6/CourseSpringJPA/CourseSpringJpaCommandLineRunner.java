package com.SpringCourse.Section6.CourseSpringJPA;


import com.SpringCourse.Section6.CourseJpa.CourseJpaRepository;
import com.SpringCourse.Section6.Data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringJpaRepository courseSpringJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course(8,"spring lol8","Nie ja");
        Course course2 = new Course(9,"spring lol9","Nie ja");
        Course course3 = new Course(10,"spring lol10","Nie ja");
   
        courseSpringJpaRepository.save(course1);
        courseSpringJpaRepository.save(course2);
        courseSpringJpaRepository.save(course3);

        courseSpringJpaRepository.deleteById(10l);

        System.out.println(courseSpringJpaRepository.findById(9l));

    }
}
