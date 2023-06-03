package ru.job4j.di;

public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

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