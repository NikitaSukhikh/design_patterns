package decorator.christmas_tree;

public class TestDrive {
    public static void main(String[] args) {

        ChristmasTree tree1 = new Garland(new ChristmasTreeReal());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeReal())));
        System.out.println(tree2.decorate());

        ChristmasTree tree3 = new ChristmasTreeReal();
        System.out.println(tree3.decorate());
    }
}
