package factory.buttons.buttons;

//another concrete product

public class HtmlButton implements Button {
    public void render () {
        System.out.println("<button> Test Button <button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says: 'Hello, world!'");
    }
}
