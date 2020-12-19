package factory.shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingShapeDemo {


    public static void main(String[] args) throws IOException {

        for (;;) {

            System.out.println("Insert way of input: command line / java code : ");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = in.readLine();
            boolean cmd = line.equalsIgnoreCase("command line");
            boolean jv = line.equalsIgnoreCase("java code");
            boolean ext = line.equalsIgnoreCase("Quit");


            if (cmd) {

                System.out.println("Insert type of shape: square/rectangle/circle : ");
                WayInputShapeType way = new MakingShapeCmdLine();
                way.chooseInput();

                System.out.println("Main() closed");
                break;

            } else if (jv) {

                System.out.println("Going to the proper java class...\n");
                WayInputShapeType way = new MakingShapeJavaCode();
                way.chooseInput();

                System.out.println("\nMain() closed");
                break;

            } else if (ext) {

                System.out.println("Main() closed");
                in.close();
                break;

            } else  {
                System.out.println("Try again...");

            }

        }

    }
}
