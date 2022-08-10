package Seminar_1;

abstract class Person {
    private String name;
    private  String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person() {

    }

    abstract String getName();

    abstract String getSurname();

}
