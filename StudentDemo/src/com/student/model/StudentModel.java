package com.student.model;

public class StudentModel {

  private String studentName;
  private String address;
  private Integer age;
  private Integer marks;
  private Integer gender;
  private Integer id;
  private Integer rollNO;



  public StudentModel(String studentName, String address, Integer age, Integer marks,
      Integer gender, Integer rollNO) {
    this.studentName = studentName;
    this.address = address;
    this.age = age;
    this.marks = marks;
    this.gender = gender;
    this.rollNO = rollNO;
  }

  public StudentModel() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @return the studentName
   */
  public String getStudentName() {
    return studentName;
  }

  /**
   * @param studentName the studentName to set
   */
  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the age
   */
  public Integer getAge() {
    return age;
  }

  /**
   * @param age the age to set
   */
  public void setAge(Integer age) {
    this.age = age;
  }

  /**
   * @return the marks
   */
  public Integer getMarks() {
    return marks;
  }

  /**
   * @param marks the marks to set
   */
  public void setMarks(Integer marks) {
    this.marks = marks;
  }

  /**
   * @return the gender
   */
  public Integer getGender() {
    return gender;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(Integer gender) {
    this.gender = gender;
  }



  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * @return the rollNO
   */
  public Integer getRollNO() {
    return rollNO;
  }

  /**
   * @param rollNO the rollNO to set
   */
  public void setRollNO(Integer rollNO) {
    this.rollNO = rollNO;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((address == null) ? 0 : address.hashCode());
    result = prime * result + ((age == null) ? 0 : age.hashCode());
    result = prime * result + ((gender == null) ? 0 : gender.hashCode());
    result = prime * result + ((marks == null) ? 0 : marks.hashCode());
    result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    StudentModel other = (StudentModel) obj;
    if (address == null) {
      if (other.address != null)
        return false;
    } else if (!address.equals(other.address))
      return false;
    if (age == null) {
      if (other.age != null)
        return false;
    } else if (!age.equals(other.age))
      return false;
    if (gender == null) {
      if (other.gender != null)
        return false;
    } else if (!gender.equals(other.gender))
      return false;
    if (marks == null) {
      if (other.marks != null)
        return false;
    } else if (!marks.equals(other.marks))
      return false;
    if (studentName == null) {
      if (other.studentName != null)
        return false;
    } else if (!studentName.equals(other.studentName))
      return false;
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "StudentModel [studentName=" + studentName + ", address=" + address + ", age=" + age
        + ", marks=" + marks + ", gender=" + gender + "]";
  }


}
