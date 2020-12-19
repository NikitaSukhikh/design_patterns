package factory.buttons_factory;
import factory.buttons.HtmlButton;
import factory.buttons.Button;

//concrete creator

public class HtmlDialog  extends Dialog {

    @Override
    public Button createButton(){
     return new HtmlButton();
    }

}
