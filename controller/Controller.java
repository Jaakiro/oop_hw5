package org.example.hw5.controller;

import org.example.hw5.model.Student;
import org.example.hw5.model.StudyGroup;
import org.example.hw5.model.Type;
import org.example.hw5.service.DataService;
import org.example.hw5.view.StudentView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroup studyGroup = new StudyGroup();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (Student student : dataService.getAllStudent()) {
            studentView.printOnConsole(student);
        }
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
