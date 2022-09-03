/**
 * Интерфейс, реализующий базовые методы поиска связей в генеалогическом дереве.
 * @autor Дмитрий Лобанов
 * @version 1.0
 */
package Seminar_1;

public interface    BaseResearcher {

    /**
     *Метод вывода в консоль информации о детях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printChilds(String name, Tree tree);

    /**
     * Метод вывода в консоль информации о родителях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printParent(String name, Tree tree);

    /**
     * Метод вывода в консоль информации о внуках исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printGrandSon(String name, Tree tree);

    /**
     * Метод вывода в консоль информации о родственниках через поколение (бабушка, дедушка).
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printGrandParent(String name, Tree tree);

    /**
     * Метод вывода в консоль информации о родных братьях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printBrother(String name, Tree tree);

    /**
     * Метод вывода в консоль информации о родных сёстрах исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    void printSister(String name, Tree tree);



}
