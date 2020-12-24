package abstract_factory.os_buttons.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
