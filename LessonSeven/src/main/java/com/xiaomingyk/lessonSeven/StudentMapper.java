package com.xiaomingyk.lessonSeven;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xzhu7 on 12/27/2016.
 */
public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException{

        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setAge(rs.getInt("age"));
        student.setName(rs.getString("name"));
        return student;
    }
}
