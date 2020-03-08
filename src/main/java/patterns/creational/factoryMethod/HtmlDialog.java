package patterns.creational.factoryMethod;


import patterns.creational.factoryMethod.button.Button;
import patterns.creational.factoryMethod.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}