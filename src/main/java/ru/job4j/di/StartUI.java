package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

    public void add(String question) {
        String rsl = consoleInput.askStr(question);
        store.add(rsl);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}