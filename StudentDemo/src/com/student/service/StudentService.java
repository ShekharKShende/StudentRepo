package com.student.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.model.StudentModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentService.
 */
public interface StudentService {

  /**
   * Save student.
   * 
   * @param student the student
   * @throws SQLException the SQL exception
   */
  public void saveStudent(StudentModel student) throws SQLException;

  /**
   * Delete student.
   * 
   * @param rollNo the roll no
   * @return true, if successful
   * @throws SQLException the SQL exception
   */
  public boolean deleteStudent(int rollNo) throws SQLException;

  /**
   * Gets the student.
   * 
   * @param rollNo the roll no
   * @return the student
   * @throws SQLException the SQL exception
   */
  public StudentModel getStudent(int rollNo) throws SQLException;

  /**
   * Gets the first student.
   * 
   * @return the first student
   * @throws SQLException the SQL exception
   */
  public StudentModel getFirstStudent() throws SQLException;

  /**
   * Gets the last student.
   * 
   * @return the last student
   * @throws SQLException the SQL exception
   */
  public StudentModel getLastStudent() throws SQLException;

  /**
   * Gets the nextt student.
   * 
   * @param studentId the student id
   * @return the nextt student
   * @throws SQLException the SQL exception
   */
  public StudentModel getNexttStudent(int studentId) throws SQLException;

  /**
   * Gets the prevt student.
   * 
   * @param studentId the student id
   * @return the prevt student
   * @throws SQLException the SQL exception
   */
  public StudentModel getPrevtStudent(int studentId) throws SQLException;

  /**
   * Update student.
   * 
   * @param studentModel the student model
   * @return the int
   * @throws SQLException the SQL exception
   */
  public int updateStudent(StudentModel studentModel) throws SQLException;
}
