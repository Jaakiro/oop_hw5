package org.example.hw5.model;

import java.util.List;

public class StudyGroup {
    private String teacher;
    private List<Student> students;

    public StudyGroup(){
        this.teacher = teacher;
        this.students = students;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher='" + teacher + '\'' +
                ", students=" + students +
                '}';
    }
}
