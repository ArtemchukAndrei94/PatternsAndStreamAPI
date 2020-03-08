package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.button.Button;
import patterns.creational.abstractFactory.button.MacOSButton;
import patterns.creational.abstractFactory.checkbox.Checkbox;
import patterns.creational.abstractFactory.checkbox.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
