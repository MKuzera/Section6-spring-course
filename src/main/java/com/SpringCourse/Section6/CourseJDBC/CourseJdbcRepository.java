package com.SpringCourse.Section6.CourseJDBC;

import com.SpringCourse.Section6.Data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = """
            insert into course(id,name,author)
            values(?,?,?);
            """;
    private static String DELETE_QUERY = """
            delete from course where id = ?""";
    private static String SELECT_QUERY = """
            select * from course where id = ?""";
    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void delete(Course course){
        jdbcTemplate.update(DELETE_QUERY,course.getId());
    }
    public Course selectById(int id){
        return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);

    }

}
