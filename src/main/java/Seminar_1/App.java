package Seminar_1;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {
        Person person = new Man("Dmitriyy", "L", 29);
        Person person1 = new Man("Vitaliyy", "L", 45);
        Person person2 = new Man("Victor", "L", 61);
        Person person3 = new Woman("Lidia", "S", 82);
        Person person4 = new Man("Artem", "L", 123);
        Person person5 = new Woman("Irina", "L", 12);

        BaseTree tree = new Tree();

        tree.addLink(person1, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person, Relation.GRANDPARENT, Relation.GRANDSON);
        tree.addLink(person3, person2, Relation.GRANDPARENT, Relation.GRANDSON);
        tree.addLink(person4, person, Relation.BROTHER, Relation.BROTHER);
        tree.addLink(person5, person, Relation.BROTHER, Relation.SISTER);

        BaseResearcher br = new Research();
        BaseUploader bu = new UploadToFile();

        //br.printChilds("Vitaliyy", tree);
        //br.printChilds("Vitaliyy", tree);
        //br.printParent("Lidia", tree);
        //br.printGrandSon("Lidia", tree);
        //br.printGrandParent("Dmitriyy", tree);
        //br.printBrother("Dmitriyy", tree);
        //br.printSister("Dmitriyy", tree);
        //bu.uploadToTXT(tree);
        //System.out.println(person.compareTo(person1));




    }
}
