package factory.buttons.factory;
import factory.buttons.buttons.HtmlButton;
import factory.buttons.buttons.Button;

//concrete creator

public class HtmlDialog  extends Dialog {

    @Override
    public Button createButton(){
     return new HtmlButton();
    }

}
