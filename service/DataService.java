package org.example.hw5.service;


import org.example.hw5.model.Student;
import org.example.hw5.model.Teacher;
import org.example.hw5.model.Type;
import org.example.hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            users.add(new Student(firstName, secondName, lastName, id));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(firstName, secondName, lastName, id));
        }

    }

    private int getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentID() + 1;
            else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return lastId;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student) user);
        }
        return students;

    }
}

