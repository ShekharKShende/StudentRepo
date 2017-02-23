package com.student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.student.impl.StudentServiceImpl;
import com.student.model.StudentModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonClickListner.
 */
public class ButtonClickListner implements ActionListener {
  
  /** The impl service impl. */
  private StudentServiceImpl implServiceImpl = new StudentServiceImpl();
  
  /** The my frame. */
  private MyFrame myFrame;
  
  /** The operation. */
  private String operation;
  
  /** The gender. */
  private Integer gender;

  /**
   * Instantiates a new button click listner.
   *
   * @param myFrame the my frame
   * @param operation the operation
   */
  public ButtonClickListner(MyFrame myFrame, String operation) {
    this.myFrame = myFrame;
    this.operation = operation;
  }

  /* (non-Javadoc)
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    StudentModel studentModel = null;
    switch (operation) {
      case "Save":
        gender = myFrame.genderGroup.getSelectedCheckbox().getLabel().equals("Male") ? 1 : 0;
        studentModel =
            new StudentModel(myFrame.studentName.getText(), myFrame.address.getText(),
                Integer.parseInt(myFrame.age.getSelectedItem()), Integer.parseInt(myFrame.marks
                    .getText()), gender, Integer.parseInt(myFrame.rollNumber.getText()));
        try {
          implServiceImpl.saveStudent(studentModel);
        } catch (SQLException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        break;
      case "First":
        try {
          studentModel = implServiceImpl.getFirstStudent();
          if (studentModel != null) {
            myFrame.studentName.setText(studentModel.getStudentName());
            myFrame.id.setText(""+studentModel.getId());
            myFrame.address.setText(studentModel.getAddress());
            myFrame.age.select("" + studentModel.getAge());
            myFrame.marks.setText("" + studentModel.getMarks());
            myFrame.rollNumber.setText("" + studentModel.getRollNO());
            myFrame.genderGroup.setSelectedCheckbox(studentModel.getGender() == 1 ? myFrame.male
                : myFrame.female);
          }
        } catch (SQLException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        break;
      case "Last":
        try {
          studentModel = implServiceImpl.getLastStudent();
          if (studentModel != null) {
            myFrame.studentName.setText(studentModel.getStudentName());
            myFrame.id.setText(""+studentModel.getId());
            myFrame.address.setText(studentModel.getAddress());
            myFrame.age.select("" + studentModel.getAge());
            myFrame.marks.setText("" + studentModel.getMarks());
            myFrame.rollNumber.setText("" + studentModel.getRollNO());
            myFrame.genderGroup.setSelectedCheckbox(studentModel.getGender() == 1 ? myFrame.male
                : myFrame.female);
          }
        } catch (SQLException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        break;
      case "Next":
         try {
           studentModel  =implServiceImpl.getNexttStudent(Integer.parseInt(myFrame.id.getText()));
           
           if (studentModel != null) {
             myFrame.studentName.setText(studentModel.getStudentName());
             myFrame.id.setText(""+studentModel.getId());
             myFrame.address.setText(studentModel.getAddress());
             myFrame.age.select("" + studentModel.getAge());
             myFrame.marks.setText("" + studentModel.getMarks());
             myFrame.rollNumber.setText("" + studentModel.getRollNO());
             myFrame.genderGroup.setSelectedCheckbox(studentModel.getGender() == 1 ? myFrame.male
                 : myFrame.female);
           }
        } catch (NumberFormatException | SQLException e2) {
         
          e2.printStackTrace();
        }
        break;
      case "Prev":
        try {
           studentModel =implServiceImpl.getPrevtStudent(Integer.parseInt(myFrame.id.getText()));
           if (studentModel != null) {
             myFrame.studentName.setText(studentModel.getStudentName());
             myFrame.id.setText(""+studentModel.getId());
             myFrame.address.setText(studentModel.getAddress());
             myFrame.age.select("" + studentModel.getAge());
             myFrame.marks.setText("" + studentModel.getMarks());
             myFrame.rollNumber.setText("" + studentModel.getRollNO());
             myFrame.genderGroup.setSelectedCheckbox(studentModel.getGender() == 1 ? myFrame.male
                 : myFrame.female);
           }
       } catch (NumberFormatException | SQLException e2) {
         e2.printStackTrace();
       }
       break;
      case "Search":
        try {
          studentModel = implServiceImpl.getStudent(Integer.parseInt(myFrame.search.getText().toString()));
          if (studentModel != null) {
            myFrame.studentName.setText(studentModel.getStudentName());
            myFrame.id.setText(""+studentModel.getId());
            myFrame.address.setText(studentModel.getAddress());
            myFrame.age.select("" + studentModel.getAge());
            myFrame.marks.setText("" + studentModel.getMarks());
            myFrame.rollNumber.setText("" + studentModel.getRollNO());
            myFrame.genderGroup.setSelectedCheckbox(studentModel.getGender() == 1 ? myFrame.male
                : myFrame.female);
          }
        } catch (SQLException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        break;
      case "Update":
        gender = myFrame.genderGroup.getSelectedCheckbox().getLabel().equals("Male") ? 1 : 0;
        studentModel =
            new StudentModel(myFrame.studentName.getText(), myFrame.address.getText(),
                Integer.parseInt(myFrame.age.getSelectedItem()), Integer.parseInt(myFrame.marks
                    .getText()), gender, Integer.parseInt(myFrame.rollNumber.getText()));
        try {
          int row = implServiceImpl.updateStudent(studentModel);
          if (row == 1) {
            System.out.println("updated successfully");
          } else {
            System.out.println("failed to update student details");
          }
        } catch (SQLException e1) {
          e1.printStackTrace();
        }

        break;
      case "Delete":
        try {
          boolean isDeleted = implServiceImpl.deleteStudent(Integer.parseInt(myFrame.rollNumber.getText()));
          if (!isDeleted) {
            System.out.println("deleted successfully");
          } else {
            System.out.println("failed to delete student details");
          }
        } catch (SQLException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        break;

    }


  }

}
