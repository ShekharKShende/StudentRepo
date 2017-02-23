package com.student.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



// TODO: Auto-generated Javadoc
/**
 * The Class DBHelper.
 */
public class DBHelper {

  /**
   * Make connection.
   * 
   * @return the connection
   */
  public static Connection makeConnection() {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    try {
      con =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/studentSchema", "root", "root");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return con;
  }
}
