package org.example;

public class Persoana {

    private String name;
    private String surname;
    private Integer age;



    public Persoana(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
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
                name + " " + surname +  ", age=" + age +
                "   ";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana person = (Persoana)o;
        return name.equals(person.name) && surname.equals(person.surname);
    }
}
