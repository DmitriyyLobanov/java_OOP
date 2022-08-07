package Seminar_1;

import java.util.List;

public class Research {
    public static void printChilds(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el: links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.PARENT){
                System.out.println(el.getPersonSecond());
            }
        }

    }

    public  static void printParent(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el: links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.CHILD){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public  static  void printGrandSon(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.GRANDPARENT){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void printGrandParent(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.GRANDSON){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void printBrother(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.BROTHER){
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void printSister(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el:links) {
            if(el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.SISTER){
                System.out.println(el.getPersonSecond());
            }
        }
    }


}
