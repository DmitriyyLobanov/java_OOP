/**
 * Класс исследования межличностных родственных связей.
 * Реализует интерфейс базовых исследований.
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

import java.util.List;

public class Research implements BaseResearcher {

    /**
     *Метод вывода в консоль информации о детях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printChilds(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el: links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.PARENT){
                System.out.println(el.getPersonSecond());
            }
        }

    }

    /**
     * Метод вывода в консоль информации о родителях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printParent(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el: links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.CHILD){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    /**
     * Метод вывода в консоль информации о внуках исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printGrandSon(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.GRANDPARENT){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    /**
     * Метод вывода в консоль информации о родственниках через поколение (бабушка, дедушка).
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printGrandParent(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.GRANDSON){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    /**
     * Метод вывода в консоль информации о родных братьях исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printBrother(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.BROTHER){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    /**
     * Метод вывода в консоль информации о родных сёстрах исследуемого лица.
     * @param name Имя исследуемого лица.
     * @param tree Экземпляр генеалогического дерева.
     */
    public void printSister(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.SISTER){
                System.out.println(el.getPersonSecond());
            }
        }
    }


}
