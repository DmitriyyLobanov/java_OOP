package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Tree extends BaseTree {
    private List<Link> links = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    @Override
    public void addLink(Person p_1, Person p_2, Relation link_1, Relation link_2) {
        Link l1 = new Link(p_1, p_2, link_1);
        Link l2 = new Link(p_2, p_1, link_2);

        links.add(l1);
        links.add(l2);
    }

    @Override
    public void removeLink(Integer index) {
        //TODO
    }

    @Override
    public void replaceLink(Person oldItem, Person newItem) {
        //TODO
    }
}


