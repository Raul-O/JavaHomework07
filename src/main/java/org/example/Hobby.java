package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String hobbyName;
    private int frequency;
    private List<Adresa> Addresses = new ArrayList<>();

    public Hobby(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public void setAddresses(Adresa address) {
        Addresses.add(address);
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getHobbyName() {
        return hobbyName;
    }


    @Override
    public String toString() {
        return hobbyName + ' ' + "-----> in     " + Addresses.toString().replaceAll("\\[", "").replaceAll("]","");
    }
}
