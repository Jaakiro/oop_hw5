package org.example.hw5.model;

public class Student extends User {
    private Integer studentID;

    public Student(String firstName, String secondName, String lastName, Integer studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                super.toString()+
                '}';
    }
}
