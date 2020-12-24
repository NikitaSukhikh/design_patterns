package throw_excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {

    public Primaries runSecond () throws IOException {


        System.out.println("Running class 'Second'");

        System.out.println("Insert : First/AnotherFirst > ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        if (line.equals("First")) return new First();
        else if (line.equals("AnotherFirst")) return new AnotherFirst();
        else {
            System.out.println("Cannot match this type");
            return null;
        }
    }
}
