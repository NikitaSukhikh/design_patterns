package abstract_factory.os_buttons.factories;

import abstract_factory.os_buttons.buttons.Button;
import abstract_factory.os_buttons.buttons.MacOSButton;
import abstract_factory.os_buttons.checkboxes.Checkbox;
import abstract_factory.os_buttons.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
