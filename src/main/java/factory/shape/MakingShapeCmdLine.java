package factory.shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingShapeCmdLine implements WayInputShapeType {

    public void chooseInput() {
        try {

          for (;;){

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = in.readLine();

            ShapeFactory shapeFactory = new ShapeFactory();

            boolean circle = line.equalsIgnoreCase("Circle");
            boolean rectangle = line.equalsIgnoreCase("Rectangle");
            boolean square = line.equalsIgnoreCase("Square");

             if (circle) {
            shapeFactory.getShape("Circle").draw();

            } else if (rectangle) {
                shapeFactory.getShape("Rectangle").draw();

            } else if (square) {

                shapeFactory.getShape("Square").draw();

            } else if (line.equalsIgnoreCase("Quit")) {
                System.out.println("Closing...");
                in.close();
                break;

             } else {
                 System.out.println("Input correct shape type:");
             }
          }
        } catch (IOException e) {e.printStackTrace();}

    }
}
