package decorator.christmas_tree;

public abstract class Decorator implements ChristmasTree {

    private ChristmasTree tree;

    public Decorator (ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
