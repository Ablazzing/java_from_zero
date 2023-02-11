package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class ChildrenGardenWithGroups {
    private Child[][] children;

    public ChildrenGardenWithGroups(Child[][] children) {
        this.children = children;
    }

    public Child[][] getChildren() {
        return children;
    }

    //[ child1, child2]
    //[ [child1, child2] - group 0, [child3, child4] - group 1 ]
}
