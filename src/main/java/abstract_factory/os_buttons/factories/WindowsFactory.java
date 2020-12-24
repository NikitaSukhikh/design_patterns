package abstract_factory.os_buttons.factories;

import abstract_factory.os_buttons.buttons.Button;
import abstract_factory.os_buttons.buttons.WindowsButton;
import abstract_factory.os_buttons.checkboxes.Checkbox;
import abstract_factory.os_buttons.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
