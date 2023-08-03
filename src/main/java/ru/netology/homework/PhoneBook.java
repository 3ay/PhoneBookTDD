package ru.netology.homework;

import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {
    private final HashMap<String, String> namePhoneMap;
    private final HashMap<String, String> phoneNameMap;
    private final TreeSet<String> namesMap;

    public PhoneBook() {
        this.namePhoneMap = new HashMap<>();
        this.phoneNameMap = new HashMap<>();
        this.namesMap = new TreeSet<>();
    }

    public int add(String name, String phone) {
        if (!namesMap.contains(name) && !phoneNameMap.containsKey(phone)) {
            namePhoneMap.put(name, phone);
            phoneNameMap.put(phone, name);
            namesMap.add(name);
        }
        return namesMap.size();
    }
}
