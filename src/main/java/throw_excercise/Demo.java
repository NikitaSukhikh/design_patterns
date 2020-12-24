package throw_excercise;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        Third third = new Third();
        third.runThird().runSecond().runFirst();

        Forth f = new Forth(new AnotherThird());
        f.doSomething();


    }
}
