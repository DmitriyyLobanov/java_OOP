package Seminar_1;

abstract class Person implements Comparable<Person> {
    protected String name;
    protected   String surname;

    protected Integer age;


    public Person() {

    }

    public Integer getAge() {return age;}

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age'" + age +
                '}';
    }
}
