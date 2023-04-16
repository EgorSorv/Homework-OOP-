package org.hw.hw4.controller;

import org.hw.hw4.data.Teacher;
import org.hw.hw4.service.TeacherGroupService;
import org.hw.hw4.service.TeacherService;
import org.hw.hw4.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherGroup(List<Teacher> teachers) {
        teacherGroupService.createTeacherGroup(teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeacherGroup());
    }

    public void getTeacherInTeacherGroup(String firstName, String secondName) {
        Teacher teacher = teacherGroupService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListTeacherFromTeacherGroup() {
        List<Teacher> students = teacherGroupService.getSortedTeacherGroup();
        teacherView.sendOnConsole(students);
    }

    public void getSortedListByFIOTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedByFIOTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }
}
