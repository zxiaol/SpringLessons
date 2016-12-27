package com.xiaomingyk.lessonSeven;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xzhu7 on 12/27/2016.
 */
public interface StudentDAO {

    public void setDataSource(DataSource ds);

    public void create(String name,Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);


}
