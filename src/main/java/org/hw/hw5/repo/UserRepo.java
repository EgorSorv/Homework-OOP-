package org.hw.hw5.repo;

import org.hw.hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> db;

    public UserRepo() {
        this.db = new ArrayList<>();
    }

    public void addUserToRepo(User user) {
        db.add(user);
    }

    public void deleteUserFromRepo(User user) {
        db.remove(user);
    }

    public User getUserFromRepo(User user) {
        for (User unit : db) {
            if (unit.getID().equals(user.getID())) {
                return unit;
            }
        }
        return null;
    }

    public void printUsersFromRepo() {
        for (User unit: db) {
            System.out.println(unit);
        }
    }

    public void replenishBalanceFromRepo(User user, double money) {
        user.setBalance((double) Math.round((user.getBalance() + money) * 100) / 100);
    }

    public void writeOfBalanceFromRepo(User user, double money) {
        user.setBalance((double) Math.round((user.getBalance() - money) * 100) / 100);
    }
}
