package abstract_factory.os_buttons.factories;

import abstract_factory.os_buttons.buttons.Button;
import abstract_factory.os_buttons.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton ();
    Checkbox createCheckbox ();
}
