package abstract_factory.os_buttons.app;

import abstract_factory.os_buttons.buttons.Button;
import abstract_factory.os_buttons.checkboxes.Checkbox;
import abstract_factory.os_buttons.factories.GUIFactory;

//client code

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application (GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void viewResult(){
        button.paint();
        checkbox.paint();
    }
}
