/**
 * Класс реализующий сущность "женщина", расширяет класс "личность".
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

public class Woman extends Person {

    /** Поле гендер*/
    private final Gender gender = Gender.FEMALE;

    /**
     * Конструктор - создание экземпляра класса с заданнием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param age возраст.
     */
    public Woman(String name, String surname, Integer age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    /**
     * Метод получения значения поля {@link Woman#gender}
     * @return Возвращает гендер.
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Перегрузка CompareTo со сравнением возраста.
     * @param o the object to be compared.
     * @return 1, 0, -1
     */
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
