package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Tree extends BaseTree {
    private List<Link> links = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    @Override
    public void addLink(Person p1, Person p2, Relation link1, Relation link2) {
        Link l1 = new Link(p1, p2, link1);
        Link l2 = new Link(p2, p1, link2);

        links.add(l1);
        links.add(l2);
    }

    @Override
    public void removeLink(Integer index) throws UnsupportedOperationException {

    }

    @Override
    public void replaceLink(Person oldItem, Person newItem) throws UnsupportedOperationException {

    }
}


