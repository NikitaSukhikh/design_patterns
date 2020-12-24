package decorator.christmas_tree;

public class Garland extends Decorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate () {
    return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
      return  "with Garland ";
    }
}
