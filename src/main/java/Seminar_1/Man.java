/**
 * Класс реализующий сущность "мужчина", расширяет класс "личность".
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

public class Man extends Person {

    /** Поле гендер*/
    private final Gender gender = Gender.MALE;


    /**
     * Конструктор - создание экземпляра класса с заданнием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param age возраст.
     */
    public Man(String name, String surname, Integer age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * Метод получения значения поля {@link Man#gender}
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
        return this.age.compareTo(o.age);
    }

}
