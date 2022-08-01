package guru.qa;

public class TestClass {
    public static void main(String... args) {

        Fridge myFridge = new Fridge(10, 5);
        myFridge.openFridge();
        myFridge.putInFridge(1, "ice cream");
        myFridge.putInFridge(5, "milk");
        myFridge.closeFridge();

        myFridge.changeTemperature(-7);
        myFridge.openFridge();
        myFridge.lookInFridge();
        myFridge.takeFromFridge(1);
        myFridge.closeFridge();
        myFridge.switchOffFridge();
        myFridge.turnOnFridge();
    }
}
