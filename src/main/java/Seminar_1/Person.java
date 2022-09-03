/**
 * Абстрактный класс реализующий сущность "личность".
 */
package Seminar_1;

abstract class Person implements Comparable<Person> {

    /**Поле имя.*/
    protected String name;

    /**Поле фамилия.*/
    protected   String surname;

    /**Поле возраст.*/
    protected Integer age;

    /**
     * Абстрактный конструктор.
     */
    public Person() {

    }

    /**
     * Метод получения значения поля {@link Person#age}
     * @return Возвращает возраст.
     */
    public Integer getAge() {return age;}

    /**
     * Метод получения значения поля {@link Person#name}
     * @return Возвращает имя.
     */
    public String getName(){
        return name;
    }

    /**
     * Метод получения значения поля {@link Person#surname}
     * @return Возвращает фамилию.
     */
    public String getSurname(){
        return surname;
    }

    /**
     * Метод получения строчного вида экземпляра класса.
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age'" + age +
                '}';
    }
}
