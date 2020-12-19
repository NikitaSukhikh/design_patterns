package factory.buttons_factory;

import factory.buttons.Button;

//base creator

public abstract class Dialog {

   public void renderWindow(){
       Button okButton = createButton();
       okButton.render();
   }

   public abstract Button createButton();

}
