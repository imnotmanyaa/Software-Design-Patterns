package task5;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
