package Seminar_1;

import java.util.ArrayList;
import java.util.List;

abstract class BaseTree  {

    private List<Link> links = new ArrayList<>();

    abstract List<Link> getLinks();

    public abstract void addLink(Person p1, Person p2, Relation link1, Relation link2);

    public abstract void removeLink(Integer index);

    public abstract void replaceLink(Person oldItem, Person newItem);
}
