package org.hw.hw5.view;

import org.hw.hw5.controller.UserController;
import org.hw.hw5.model.User;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        User user1 = new User(1, "Иван", 21, 35678.76);
        User user2 = new User(2, "Сергей", 17, 15000.00);
        User user3 = new User(3, "Алена", 45, 134321.23);
        User user4 = new User(4, "Александр", 34, 55000.80);
        User user5 = new User(5, "Мария", 22, 3321.11);
        User user6 = new User(6, "Олег", 76, 564.54);
        User user7 = new User(7, "Дмитрий", 40, 70000.00);

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
        userController.addUser(user4);
        userController.addUser(user5);
        userController.addUser(user6);
        userController.addUser(user7);
        userController.replenishment(user1, 20000.00);
        userController.print();
        System.out.println("=========");
        userController.deleteUser(user4);
        userController.writeOff(user1, 40000.0);
        userController.print();
    }
}
