package Seminar_1;

public class App {
    public static void main(String[] args) {
        Person person = new Man("Dmitriyy", "L");
        Person person1 = new Man("Vitaliyy", "L");
        Person person2 = new Man("Victor", "L");
        Person person3 = new Woman("Lidia", "S");
        Person person4 = new Man("Artem", "L");
        Person person5 = new Woman("Irina", "L");

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

    }
}
