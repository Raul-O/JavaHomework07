package org.example;

public class Adresa {
    private String name;
    private Tara tara;

    public Adresa(String name, Tara tara) {
        this.name = name;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return  "" + tara;
    }


}
