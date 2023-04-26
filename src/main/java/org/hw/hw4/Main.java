package org.hw.hw4;

import org.hw.hw4.data.Teacher;
import org.hw.hw4.data.UserComparator;
import org.hw.hw4.view.TeacherView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        Teacher teacher1 = new Teacher("Ольга", "Соколова", "Николаевна", LocalDate.of(1981,3,20));
        Teacher teacher2 = new Teacher("Петр", "Смирнов", "Сергеевич", LocalDate.of(1976, 9, 30));

        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1, teacher2));

        teachers.add(teacher1);
        teachers.add(teacher2);

        TeacherView print = new TeacherView();
        print.sendOnConsole(teachers);
    }
}
