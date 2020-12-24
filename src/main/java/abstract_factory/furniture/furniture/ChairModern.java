package abstract_factory.furniture.furniture;

public class ChairModern implements Chair{

    @Override
    public void hasLegs() {
        System.out.println("Hi! I am modern chair. I have four legs.");

    }

    @Override
    public void sitOn() {

    }
}
