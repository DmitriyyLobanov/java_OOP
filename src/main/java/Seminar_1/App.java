package Seminar_1;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Dmitriyy", "L");
        Person person1 = new Person("Vitaliyy", "L");
        Person person2 = new Person("Victor", "L");
        Person person3 = new Person("Lidia", "S");
        Person person4 = new Person("Artem", "L");
        Person person5 = new Person("Irina", "L");

        Tree tree = new Tree();
        tree.addLink(person1, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person, Relation.GRANDPARENT, Relation.GRANDSON);
        tree.addLink(person3, person2, Relation.GRANDPARENT, Relation.GRANDSON);
        tree.addLink(person4, person, Relation.BROTHER, Relation.BROTHER);
        tree.addLink(person5, person, Relation.BROTHER, Relation.SISTER);

        //Research.printChilds("Vitaliyy", tree);
        //Research.printParent("Lidia", tree);
        //Research.printGrandSon("Lidia", tree);
        //Research.printGrandParent("Dmitriyy", tree);
        //Research.printBrother("Dmitriyy", tree);
        //Research.printSister("Dmitriyy", tree);
        UploadToFile.uploadToTXT(tree);

    }
}
