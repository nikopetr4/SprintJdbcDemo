package com.petroudis.SpringJDBCDemo.repo;

import com.petroudis.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepo {
    //JDBC TEMPLATE
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String query = "insert into student(rollNumber, name, marks) values (?,?,?)";
        int rows = jdbc.update(query, s.getRollNumber(), s.getName(), s.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        // one row at a time

        return jdbc.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setRollNumber(rs.getInt("rollNumber"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
