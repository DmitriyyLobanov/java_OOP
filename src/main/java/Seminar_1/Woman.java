package Seminar_1;

public class Woman extends Person {


    private final Gender gender = Gender.FEMALE;

    public Woman(String name, String surname, Integer age) {
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
        return 0;
    }
}
