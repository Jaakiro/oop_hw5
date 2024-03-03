package org.example.hw5.model;

public class Teacher extends User {
    private Integer teacherID;

    public Teacher(String firstName, String secondName, String lastName, Integer teacherID) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                super.toString()+
                '}';
    }
}
