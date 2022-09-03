/**
 * Абстрактный класс хранения связей в генеалогическом дереве.
 * @autor Дмитрий Лобанов
 * @version 1.0
 */

package Seminar_1;

import java.util.ArrayList;
import java.util.List;

abstract class BaseTree  {

    /**Поле связи*/
    private List<Link> links = new ArrayList<>();

    /**
     * Метод возвращения списка связей.
     * @return Возвращает список связей.
     */
    abstract List<Link> getLinks();

    /**
     * Метод добавления связи в список.
     * @param p1 личность №1.
     * @param p2 личность №2.
     * @param link1 связь первой личности со второй.
     * @param link2 связь второй личности с первой.
     */
    public abstract void addLink(Person p1, Person p2, Relation link1, Relation link2);

    /**
     * Метод удаления связи по индексу.
     * @param index индекс, удаляемой связи.
     */
    public abstract void removeLink(Integer index);

    /**
     * Метод заменяющий личность в списке.
     * @param oldItem заменяемая личность.
     * @param newItem заменяющая личность.
     */
    public abstract void replaceLink(Person oldItem, Person newItem);
}
