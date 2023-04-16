package org.hw.hw4.view;

import org.hw.hw4.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
