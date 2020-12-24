package decorator.christmas_tree;

public class BubbleLights extends Decorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate () {
        return  super.decorate() + decorateWithBubbleLights();
    }

    public String decorateWithBubbleLights() {
        return "with Bubble Lights ";
    }


}
