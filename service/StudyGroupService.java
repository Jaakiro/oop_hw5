package org.example.hw5.service;


import org.example.sem5.model.Student;
import org.example.sem5.model.Type;
import org.example.sem5.model.User;
import org.example.sem5.service.DataService;

import java.util.List;


public class StudyGroupService extends DataService {

    @Override
    public void create(String firstName, String secondName, String lastName, Type type) {
        super.create(firstName, secondName, lastName, type);
    }

    @Override
    public List<User> getUsers() {
        return super.getUsers();
    }

    @Override
    public List<Student> getAllStudent() {
        return super.getAllStudent();
    }
}

