package com.student.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.student.common.DBHelper;
import com.student.model.StudentModel;
import com.student.service.StudentService;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentServiceImpl.
 */
public class StudentServiceImpl implements StudentService {

  /** The connection. */
  private Connection connection = DBHelper.makeConnection();

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#saveStudent(com.student.model.StudentModel)
   */
  @Override
  public void saveStudent(StudentModel student) throws SQLException {

    String query =
        "insert into student(rollNo,studentName,address,marks,age,gender)"
            + "values(?,?, ?, ?, ?, ?)";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setInt(1, student.getRollNO());
    statement.setString(2, student.getStudentName());
    statement.setString(3, student.getAddress());
    statement.setInt(4, student.getMarks());
    statement.setInt(5, student.getAge());
    statement.setInt(6, student.getGender());
    statement.executeUpdate();

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#deleteStudent(int)
   */
  @Override
  public boolean deleteStudent(int rollNo) throws SQLException {
    String query = "delete from student where rollNo=?";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setInt(1, rollNo);

    return statement.execute();

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#getStudent(int)
   */
  @Override
  public StudentModel getStudent(int rollNo) throws SQLException {
    String query = "select * from student where rollNo=?";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setInt(1, rollNo);
    ResultSet resultSet = statement.executeQuery();

    StudentModel studentModel = null;
    while (resultSet.next()) {
      studentModel = new StudentModel();
      studentModel.setId(resultSet.getInt("id"));
      studentModel.setStudentName(resultSet.getString("studentName"));
      studentModel.setAddress(resultSet.getString("address"));
      studentModel.setAge(resultSet.getInt("age"));
      studentModel.setRollNO(resultSet.getInt("rollNo"));
      studentModel.setMarks(resultSet.getInt("marks"));
      studentModel.setGender(resultSet.getInt("gender"));
    }

    return studentModel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#getFirstStudent()
   */
  @Override
  public StudentModel getFirstStudent() throws SQLException {

    String query = "select * from student order by id asc limit 1";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    StudentModel studentModel = null;
    while (resultSet.next()) {
      studentModel = new StudentModel();
      studentModel.setId(resultSet.getInt("id"));
      studentModel.setStudentName(resultSet.getString("studentName"));
      studentModel.setAddress(resultSet.getString("address"));
      studentModel.setAge(resultSet.getInt("age"));
      studentModel.setMarks(resultSet.getInt("marks"));
      studentModel.setGender(resultSet.getInt("gender"));
      studentModel.setRollNO(resultSet.getInt("rollNo"));
    }

    return studentModel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#getLastStudent()
   */
  @Override
  public StudentModel getLastStudent() throws SQLException {
    String query = "select * from student order by id desc limit 1";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    StudentModel studentModel = null;
    while (resultSet.next()) {
      studentModel = new StudentModel();
      studentModel.setId(resultSet.getInt("id"));
      studentModel.setStudentName(resultSet.getString("studentName"));
      studentModel.setAddress(resultSet.getString("address"));
      studentModel.setAge(resultSet.getInt("age"));
      studentModel.setRollNO(resultSet.getInt("rollNo"));
      studentModel.setMarks(resultSet.getInt("marks"));
      studentModel.setGender(resultSet.getInt("gender"));
    }

    return studentModel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#getNexttStudent(int)
   */
  @Override
  public StudentModel getNexttStudent(int studentId) throws SQLException {


    String query = "SELECT * FROM student WHERE id > ? ORDER BY id LIMIT 1";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setInt(1, studentId);
    ResultSet resultSet = statement.executeQuery();

    StudentModel studentModel = null;
    while (resultSet.next()) {
      studentModel = new StudentModel();
      studentModel.setId(resultSet.getInt("id"));
      studentModel.setStudentName(resultSet.getString("studentName"));
      studentModel.setAddress(resultSet.getString("address"));
      studentModel.setAge(resultSet.getInt("age"));
      studentModel.setRollNO(resultSet.getInt("rollNo"));
      studentModel.setMarks(resultSet.getInt("marks"));
      studentModel.setGender(resultSet.getInt("gender"));
    }

    return studentModel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#getPrevtStudent(int)
   */
  @Override
  public StudentModel getPrevtStudent(int studentId) throws SQLException {

    String query = "SELECT * FROM student WHERE id < ? ORDER BY id DESC LIMIT 1";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setInt(1, studentId);
    ResultSet resultSet = statement.executeQuery();

    StudentModel studentModel = null;
    while (resultSet.next()) {
      studentModel = new StudentModel();
      studentModel.setId(resultSet.getInt("id"));
      studentModel.setStudentName(resultSet.getString("studentName"));
      studentModel.setAddress(resultSet.getString("address"));
      studentModel.setAge(resultSet.getInt("age"));
      studentModel.setRollNO(resultSet.getInt("rollNo"));
      studentModel.setMarks(resultSet.getInt("marks"));
      studentModel.setGender(resultSet.getInt("gender"));
    }

    return studentModel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.student.service.StudentService#updateStudent(com.student.model.StudentModel)
   */
  @Override
  public int updateStudent(StudentModel studentmodel) throws SQLException {

    String query =
        "update student set studentName=?,address=?,marks=?,age=?,gender=? where studentName=?";

    PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
    statement.setString(1, studentmodel.getStudentName());
    statement.setString(2, studentmodel.getAddress());
    statement.setInt(3, studentmodel.getMarks());
    statement.setInt(4, studentmodel.getAge());
    statement.setInt(5, studentmodel.getGender());
    statement.setString(6, studentmodel.getStudentName());

    return statement.executeUpdate();
  }

}
