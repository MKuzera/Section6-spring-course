package com.SpringCourse.Section6.CourseSpringJPA;

import com.SpringCourse.Section6.Data.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {



}
