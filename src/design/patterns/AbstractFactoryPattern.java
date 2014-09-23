package design.patterns;


abstract class GUIFactory {
    public static GUIFactory getFactory() {
        //int sys = readFromConfigFile("OS_TYPE");
        int sys = 0;
        
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }
 
    public abstract Button createButton();
}
 
 
class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}
 
 
class OSXFactory extends GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}
 
 
 
abstract class Button {
    public abstract void paint();
}
 
 
class WinButton extends Button {
    public void paint() {
        System.out.println("Przycisk WinButton");
    }
}
 
 
class OSXButton extends Button {
    public void paint() {
        System.out.println("Przycisk OSXButton");
    }
}
 
 
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        GUIFactory factory = GUIFactory.getFactory();
        Button button = factory.createButton();
        button.paint();
    }
}