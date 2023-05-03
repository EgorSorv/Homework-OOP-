package org.hw.hw5.service;

import org.hw.hw5.model.User;
import org.hw.hw5.repo.UserRepo;

public class UserService {
    private final UserRepo userRepo = new UserRepo();

    public void addToRepo(User user) {
        userRepo.addUserToRepo(user);
    }

    public void deleteFromRepo(User user) {
        userRepo.deleteUserFromRepo(user);
    }

    public User getFromRepo(User user) {
        return userRepo.getUserFromRepo(user);
    }

    public void printUsers() {
        userRepo.printUsersFromRepo();
    }

    public void replenishBalance(User user, double money) {
        userRepo.replenishBalanceFromRepo(user, money);
    }

    public void writeOfBalance(User user, double money) {
                if (user.getBalance() >= money)
                    userRepo.writeOfBalanceFromRepo(user, money);
                else
                    System.out.println("На вашем счете недостаточно средств");

    }
}
