/**
 * Класс реализующий сущность связи между людьми.
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

public class Link {

    /** Поле личность №1.*/
    private  Person personFirst;

    /** Поле личность №2*/
    private  Person personSecond;

    /** Поле родственная связь*/
    private  Relation link;

    /**
     * Конструктор создания екземпляра связи.
     * @param personFirst личность №1.
     * @param personSecond личность №2.
     * @param link поле родственаня связь.
     */
    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    /**
     * Метод получения значения поля {@link Link#personFirst}
     * @return возвращает личность №1.
     */
    public Person getPersonFirst() {
        return personFirst;
    }

    /**
     * Метод получения значения поля {@link Link#personSecond}
     * @return возвращает личность №2.
     */
    public Person getPersonSecond() {
        return personSecond;
    }

    /**
     * Метод получения значения поля {@link Link#link}
     * @return возвращает тип родственной связи.
     */
    public Relation getLink() {
        return link;
    }

    /**
     * Метод получения строчного вида экземпляра связи.
     * @return возвращает строчный вид.
     */
    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + personFirst +
                ", personSecond=" + personSecond +
                ", link=" + link +
                '}';
    }
}
