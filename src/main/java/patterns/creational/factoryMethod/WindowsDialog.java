package patterns.creational.factoryMethod;

import patterns.creational.factoryMethod.button.Button;
import patterns.creational.factoryMethod.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}