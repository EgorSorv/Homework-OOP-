package org.hw.hw5.controller;

import org.hw.hw5.model.User;
import org.hw.hw5.service.UserService;

public class UserController {
    private final UserService userService = new UserService();

    public void addUser(User user) {
        userService.addToRepo(user);
    }

    public void deleteUser(User user) {
        userService.deleteFromRepo(user);
    }

    public User getUser(User user) {
        return userService.getFromRepo(user);
    }

    public void print() {
        userService.printUsers();
    }

    public void replenishment(User user, double money) {
        userService.replenishBalance(user, money);
    }

    public void writeOff(User user, double money) {
        userService.writeOfBalance(user, money);
    }
}
