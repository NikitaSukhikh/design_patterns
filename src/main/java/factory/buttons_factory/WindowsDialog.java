package factory.buttons_factory;

import factory.buttons.WindowsButton;
import factory.buttons.Button;

//another concrete creator

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton (){
        return new WindowsButton();
    }
}
