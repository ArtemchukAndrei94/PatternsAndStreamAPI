package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.button.Button;
import patterns.creational.abstractFactory.button.WindowsButton;
import patterns.creational.abstractFactory.checkbox.Checkbox;
import patterns.creational.abstractFactory.checkbox.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}