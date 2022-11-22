package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int l = name.length();
        int spaces = 0;
        for (int i = 0; i < l; i ++){
            if (name.charAt(i) == ' ') {
                spaces++;
            }
        }

        return l >= 3
                && l <= 19
                && spaces == 1
                && !name.startsWith(" ")
                && !name.endsWith(" ");
    }
}