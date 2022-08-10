package Seminar_1;

import java.util.ArrayList;
import java.util.List;

abstract class BaseTree implements TreeUtils{

    private List<Link> links = new ArrayList<>();

    abstract List<Link> getLinks();

    public abstract void addLink(Person p_1, Person p_2, Relation link_1, Relation link_2);

}
