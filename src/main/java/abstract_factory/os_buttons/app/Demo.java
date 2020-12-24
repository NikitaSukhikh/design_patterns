package abstract_factory.os_buttons.app;

import abstract_factory.os_buttons.factories.GUIFactory;
import abstract_factory.os_buttons.factories.MacOSFactory;
import abstract_factory.os_buttons.factories.WindowsFactory;


public class Demo {

    private static Application configApplication (){

        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) factory = new MacOSFactory();
        else factory = new WindowsFactory();

        return new Application(factory);
    }


    private static Application winApplication () {

        return new Application(new WindowsFactory());
    }


    public static void main(String[] args) {
        Application ap = configApplication();
        ap.viewResult();
        System.out.println(System.getProperty("os.name"));


        winApplication().viewResult();

    }
}

