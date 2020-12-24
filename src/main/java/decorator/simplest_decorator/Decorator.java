package decorator.simplest_decorator;

public class Decorator implements CommonEntity {

    OriginalObject obj = new OriginalObject();

    public String write() {

        return obj.write().toUpperCase() + "[but it might not be a truth)))]";
    }



}
