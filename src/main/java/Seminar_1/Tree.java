/**
 * Класс хранения данных генеалогического дерева.
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Tree extends BaseTree {

    /**Поле связи.*/
    private List<Link> links = new ArrayList<>();

    /**
     * Метод получения значения поля {@link Tree#links}
     * @return список связей.
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Метод добавления связи в список.
     * @param p1 личность №1.
     * @param p2 личность №2.
     * @param link1 связь первой личности со второй.
     * @param link2 связь второй личности с первой.
     */
    @Override
    public void addLink(Person p1, Person p2, Relation link1, Relation link2) {
        Link l1 = new Link(p1, p2, link1);
        Link l2 = new Link(p2, p1, link2);

        links.add(l1);
        links.add(l2);
    }

    /**
     * Метод удаления связи по индексу.
     * @param index индекс, удаляемой связи.
     * @throws UnsupportedOperationException
     */
    @Override
    public void removeLink(Integer index) throws UnsupportedOperationException {

    }

    /**
     * Метод заменяющий личность в списке.
     * @param oldItem заменяемая личность.
     * @param newItem заменяющая личность.
     * @throws UnsupportedOperationException
     */
    @Override
    public void replaceLink(Person oldItem, Person newItem) throws UnsupportedOperationException {

    }
}


