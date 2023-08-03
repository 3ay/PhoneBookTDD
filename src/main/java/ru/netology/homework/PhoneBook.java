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

    public int add(String name, String number) {
        if (!namesMap.contains(name) && !phoneNameMap.containsKey(number)) {
            namePhoneMap.put(name, number);
            phoneNameMap.put(number, name);
            namesMap.add(name);
        }
        return namesMap.size();
    }
    public String findByNumber(String number)
    {
        return null;
    }
}
