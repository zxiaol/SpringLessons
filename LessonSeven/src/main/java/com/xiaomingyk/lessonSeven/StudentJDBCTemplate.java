package com.xiaomingyk.lessonSeven;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xzhu7 on 12/27/2016.
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {

        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {

        String sql = "Insert into Student (name,age) values (?,?)";

        jdbcTemplate.update(sql,name,age);

        System.out.println("Created Record Name = " + name + " Age = " + age);

        return;

    }

    public Student getStudent(Integer id) {

        String sql = "Select * from Student where id = ?";

        Student student = jdbcTemplate.queryForObject(sql,
                new Object[]{id}, new StudentMapper());
        return student;

    }


    public void delete(Integer id) {

        String sql = "delete from Student where id = ?";

        jdbcTemplate.update(sql,id);

        System.out.println("delete students where id = "+id);

        return;

    }

    public void update(Integer id, Integer age) {

        String sql = "Update Student set age = ? where id = ?";

        jdbcTemplate.update(sql,age,id);

        System.out.println("Updated Record with ID = " + id );
        return;


    }

    public List<Student> listStudents() {

        String sql = "select * from Student";
        List <Student> students = jdbcTemplate.query(sql,
                new StudentMapper());
        return students;

    }
}
