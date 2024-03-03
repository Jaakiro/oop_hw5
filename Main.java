package org.example.hw5;

import org.example.hw5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Абдуль", "Джабар","Пак");
        controller.createStudent("Самса", "Чебурек","Кайф");
        controller.getAllStudent();
        controller.createStudent("Рома", "Желудь","Мда");
        controller.createStudent("Время", "Обеда","Ура");
        controller.getAllStudent();
    }
}
