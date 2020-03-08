package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.button.Button;
import patterns.creational.abstractFactory.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}