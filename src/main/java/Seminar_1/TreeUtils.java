/**
 * Интерфейс реализующий операции с записями в генеалогическщм дереве.
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

public interface TreeUtils {

    /**
     * Метод добавления связи в список.
     * @param p1 личность №1.
     * @param p2 личность №2.
     * @param link1 связь первой личности со второй.
     * @param link2 связь второй личности с первой.
     */
    void addLink(Person p1, Person p2, Relation link1, Relation link2);

    /**
     * Метод удаления связи по индексу.
     * @param index индекс, удаляемой связи.
     */
    void removeLink(Integer index);

    /**
     * Метод заменяющий личность в списке.
     * @param oldItem заменяемая личность.
     * @param newItem заменяющая личность.
     */
    void replaceLink(Person oldItem, Person newItem);






}
