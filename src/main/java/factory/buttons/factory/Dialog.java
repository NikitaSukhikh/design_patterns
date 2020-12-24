package factory.buttons.factory;

import factory.buttons.buttons.Button;

//base creator

public abstract class Dialog {

   public void renderWindow(){
       Button okButton = createButton();
       okButton.render();
   }

   public abstract Button createButton();

}
