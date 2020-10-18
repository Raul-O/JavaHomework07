package org.example;

public class Persoana {

    private String name;
    private Integer age;



    public Persoana(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persoana ---->" +
                name +  ", age=" + age +
                "   ";
    }
}
