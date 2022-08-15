package Seminar_1;

public class Man extends Person {

    private final Gender gender = Gender.MALE;


    public Man(String name, String surname, Integer age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.age);
    }

}
