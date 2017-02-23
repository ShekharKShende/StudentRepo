package com.student;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



// TODO: Auto-generated Javadoc
/**
 * The Class MyFrame.
 */
public class MyFrame extends Frame implements WindowListener {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 5703034259126976360L;

  /** The student name. */
  TextField studentName;

  /** The address. */
  TextField address;

  /** The marks. */
  TextField marks;

  /** The roll number. */
  TextField rollNumber;

  /** The search. */
  TextField search;

  /** The id. */
  Label id;

  /** The student name txt. */
  Label studentNameTxt;

  /** The prev. */
  Label prev;

  /** The age. */
  Choice age;

  /** The male. */
  Checkbox male;

  /** The female. */
  Checkbox female;

  /** The gender group. */
  CheckboxGroup genderGroup;

  /** The save student. */
  Button saveStudent;

  /** The update student. */
  Button updateStudent;

  /** The delete student. */
  Button deleteStudent;

  /** The next student. */
  Button nextStudent;

  /** The prev student. */
  Button prevStudent;

  /** The first student. */
  Button firstStudent;

  /** The last student. */
  Button lastStudent;

  /** The search student. */
  Button searchStudent;


  // Button b1;

  /**
   * Instantiates a new my frame.
   * 
   * @param title the title
   */
  public MyFrame(String title) {
    this.setBounds(100, 100, 800, 800);
    setVisible(true);
    setTitle(title);
    setBackground(Color.white);
    setLayout(null);

    Label searchTxt = new Label();
    searchTxt.setText("Search Student");
    searchTxt.setBounds(100, 30, 300, 20);
    add(searchTxt);

    search = new TextField();
    search.setBounds(100, 50, 300, 20);
    add(search);

    Label rollNumberTxt = new Label();
    rollNumberTxt.setText("Roll Number");
    rollNumberTxt.setBounds(100, 80, 100, 20);
    add(rollNumberTxt);
    rollNumber = new TextField();
    rollNumber.setBounds(100, 100, 300, 20);
    add(rollNumber);

    studentNameTxt = new Label();
    studentNameTxt.setText("Student Name");
    studentNameTxt.setBounds(100, 130, 300, 20);
    add(studentNameTxt);

    studentName = new TextField();
    studentName.setBounds(100, 150, 300, 20);
    add(studentName);

    Label addressTxt = new Label();
    addressTxt.setText("Address");
    addressTxt.setBounds(100, 180, 100, 20);
    add(addressTxt);

    address = new TextField();
    address.setBounds(100, 200, 300, 100);
    add(address);

    Label marksTxt = new Label();
    marksTxt.setText("Marks");
    marksTxt.setBounds(100, 320, 100, 20);
    add(marksTxt);

    marks = new TextField();
    marks.setBounds(100, 340, 300, 20);
    add(marks);


    Label ageTxt = new Label();
    ageTxt.setText("Age");
    ageTxt.setBounds(100, 380, 100, 20);
    add(ageTxt);

    age = new Choice();
    age.setBounds(100, 400, 300, 20);
    age.add("5");
    age.add("10");
    age.add("15");
    age.add("20");
    age.add("25");
    age.add("30");
    add(age);

    genderGroup = new CheckboxGroup();


    male = new Checkbox("Male", genderGroup, true);
    male.setBounds(100, 430, 100, 20);
    female = new Checkbox("Female", genderGroup, true);
    female.setBounds(300, 430, 100, 20);
    add(male);
    add(female);


    saveStudent = new Button("Save");
    saveStudent.setBounds(100, 480, 80, 30);
    saveStudent.addActionListener(new ButtonClickListner(this, "Save"));
    add(saveStudent);

    updateStudent = new Button("Update");
    updateStudent.setBounds(200, 480, 80, 30);
    updateStudent.addActionListener(new ButtonClickListner(this, "Update"));
    add(updateStudent);

    deleteStudent = new Button("Delete");
    deleteStudent.setBounds(300, 480, 80, 30);
    deleteStudent.addActionListener(new ButtonClickListner(this, "Delete"));
    add(deleteStudent);

    searchStudent = new Button("Search");
    searchStudent.setBounds(400, 480, 80, 30);
    searchStudent.addActionListener(new ButtonClickListner(this, "Search"));
    add(searchStudent);

    firstStudent = new Button("First");
    firstStudent.setBounds(100, 530, 80, 30);
    firstStudent.addActionListener(new ButtonClickListner(this, "First"));
    add(firstStudent);

    prevStudent = new Button("Prev");
    prevStudent.setBounds(200, 530, 80, 30);
    prevStudent.addActionListener(new ButtonClickListner(this, "Prev"));
    add(prevStudent);

    nextStudent = new Button("Next");
    nextStudent.setBounds(300, 530, 80, 30);
    nextStudent.addActionListener(new ButtonClickListner(this, "Next"));
    add(nextStudent);

    lastStudent = new Button("Last");
    lastStudent.setBounds(400, 530, 80, 30);
    lastStudent.addActionListener(new ButtonClickListner(this, "Last"));
    add(lastStudent);

    id = new Label();
    id.setBounds(400, 590, 80, 30);
    id.setVisible(false);
    add(id);

    prev = new Label();
    prev.setBounds(400, 590, 80, 30);
    prev.setVisible(false);
    add(prev);

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
   */
  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
   */
  @Override
  public void windowClosing(WindowEvent e) {
    MyFrame mf = (MyFrame) e.getSource();
    mf.dispose();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
   */
  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
   */
  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
   */
  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
   */
  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
   */
  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }


}
