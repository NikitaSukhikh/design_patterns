package throw_excercise;

public class AnotherThird implements Threes {
    @Override
    public Second runThird() {
        System.out.println("Running AnotherThird");

        return new Second();
    }
}
