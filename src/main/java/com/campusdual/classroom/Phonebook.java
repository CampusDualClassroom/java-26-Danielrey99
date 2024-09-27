package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> getData() {
        return this.contacts;
    }

    public void addContact(Contact c) {
        this.contacts.put(c.getCode(), c);
    }

    public void deleteContact(String code) {
        this.contacts.remove(code);
    }

    public void showPhonebook() {
        for (String key : contacts.keySet()) {
            Contact value = contacts.get(key);
            value.showContactDetails();
        }
    }
}
