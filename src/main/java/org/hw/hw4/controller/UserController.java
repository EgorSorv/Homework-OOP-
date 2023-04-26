package org.hw.hw4.controller;

import org.hw.hw4.data.User;

import java.time.LocalDate;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
