package factory.buttons.factory;

import factory.buttons.buttons.WindowsButton;
import factory.buttons.buttons.Button;

//another concrete creator

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton (){
        return new WindowsButton();
    }
}
