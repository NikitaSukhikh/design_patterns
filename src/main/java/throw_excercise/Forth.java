package throw_excercise;

public class Forth {

    private Primaries pr;

    public Forth (Threes third) {
        System.out.println("running 'Forth' constructor");
        third.runThird();

    }

    public Primaries doSomething () {
        System.out.println("Class 'Forth' doing something: ");
        pr = new First();
        pr.runFirst();
        return pr;
    }
}
